package org.bouncycastle.asn1.x509.qualified;

import androidx.room.RoomDatabase;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1PrintableString;
import org.bouncycastle.asn1.DERPrintableString;

/* JADX INFO: loaded from: classes14.dex */
public class Iso4217CurrencyCode extends ASN1Object implements ASN1Choice {
    int numeric;

    /* JADX INFO: renamed from: obj, reason: collision with root package name */
    ASN1Encodable f228236obj;
    final int ALPHABETIC_MAXSIZE = 3;
    final int NUMERIC_MINSIZE = 1;
    final int NUMERIC_MAXSIZE = RoomDatabase.MAX_BIND_PARAMETER_CNT;

    public Iso4217CurrencyCode(int i) {
        if (i > 999 || i < 1) {
            throw new IllegalArgumentException("wrong size in numeric code : not in (1..999)");
        }
        this.f228236obj = ASN1Integer.valueOf(i);
    }

    public static Iso4217CurrencyCode getInstance(Object obj2) {
        if (obj2 == null || (obj2 instanceof Iso4217CurrencyCode)) {
            return (Iso4217CurrencyCode) obj2;
        }
        if (obj2 instanceof ASN1Integer) {
            return new Iso4217CurrencyCode(ASN1Integer.getInstance(obj2).intValueExact());
        }
        if (obj2 instanceof ASN1PrintableString) {
            return new Iso4217CurrencyCode(ASN1PrintableString.getInstance(obj2).getString());
        }
        throw new IllegalArgumentException("unknown object in getInstance");
    }

    public String getAlphabetic() {
        return ((ASN1PrintableString) this.f228236obj).getString();
    }

    public int getNumeric() {
        return ((ASN1Integer) this.f228236obj).intValueExact();
    }

    public boolean isAlphabetic() {
        return this.f228236obj instanceof ASN1PrintableString;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.f228236obj.toASN1Primitive();
    }

    public Iso4217CurrencyCode(String str) {
        if (str.length() > 3) {
            throw new IllegalArgumentException("wrong size in alphabetic code : max size is 3");
        }
        this.f228236obj = new DERPrintableString(str);
    }
}
