package com.revolut.feature.core.model.domain.wallet.openbanking;

import android.os.Parcel;
import android.os.Parcelable;
import ho3.c;
import io3.b;
import io3.o;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0006J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/core/model/domain/wallet/openbanking/ExternalInstitution;", "Ljava/io/Serializable;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "ho3/a", "feature_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ExternalInstitution implements Serializable, Parcelable {

    @NotNull
    public static final Parcelable.Creator<ExternalInstitution> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f66107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f66108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f66109c;
    public final List d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o f66110g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f66111h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f66112j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List f66113l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f66114m;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            boolean z;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            b bVar = (b) parcel.readSerializable();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i);
                int iC = 0;
                while (iC != i) {
                    iC = ch.qos.logback.core.util.a.c(parcel, arrayList3, iC, 1);
                }
                arrayList = arrayList3;
            }
            boolean z3 = parcel.readInt() != 0;
            boolean z4 = parcel.readInt() != 0;
            o oVar = (o) parcel.readSerializable();
            int i2 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                arrayList4.add(c.valueOf(parcel.readString()));
            }
            if (parcel.readInt() != 0) {
                arrayList2 = arrayList4;
                z = true;
            } else {
                arrayList2 = arrayList4;
                z = false;
            }
            return new ExternalInstitution(string, string2, bVar, arrayList, z3, z4, oVar, arrayList2, z, parcel.readInt() != 0, parcel.readInt() != 0, parcel.createStringArrayList(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ExternalInstitution[i];
        }
    }

    public ExternalInstitution(String id10, String name, b logo, ArrayList arrayList, boolean z, boolean z3, o topupSettings, List requirements, boolean z4, boolean z6, boolean z11, List tags, String str) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(logo, "logo");
        Intrinsics.checkNotNullParameter(topupSettings, "topupSettings");
        Intrinsics.checkNotNullParameter(requirements, "requirements");
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.f66107a = id10;
        this.f66108b = name;
        this.f66109c = logo;
        this.d = arrayList;
        this.e = z;
        this.f = z3;
        this.f66110g = topupSettings;
        this.f66111h = requirements;
        this.i = z4;
        this.f66112j = z6;
        this.k = z11;
        this.f66113l = tags;
        this.f66114m = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ExternalInstitution)) {
            return false;
        }
        ExternalInstitution externalInstitution = (ExternalInstitution) obj2;
        return Intrinsics.f(this.f66107a, externalInstitution.f66107a) && Intrinsics.f(this.f66108b, externalInstitution.f66108b) && Intrinsics.f(this.f66109c, externalInstitution.f66109c) && Intrinsics.f(this.d, externalInstitution.d) && this.e == externalInstitution.e && this.f == externalInstitution.f && Intrinsics.f(this.f66110g, externalInstitution.f66110g) && Intrinsics.f(this.f66111h, externalInstitution.f66111h) && this.i == externalInstitution.i && this.f66112j == externalInstitution.f66112j && this.k == externalInstitution.k && Intrinsics.f(this.f66113l, externalInstitution.f66113l) && Intrinsics.f(this.f66114m, externalInstitution.f66114m);
    }

    public final int hashCode() {
        int iHashCode = (this.f66109c.hashCode() + p.a.c(this.f66107a.hashCode() * 31, 31, this.f66108b)) * 31;
        List list = this.d;
        int iD = p.a.d(j6.a.c(j6.a.c(j6.a.c(p.a.d((this.f66110g.hashCode() + j6.a.c(j6.a.c((iHashCode + (list == null ? 0 : list.hashCode())) * 31, 31, this.e), 31, this.f)) * 31, 31, this.f66111h), 31, this.i), 31, this.f66112j), 31, this.k), 31, this.f66113l);
        String str = this.f66114m;
        return iD + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f66107a);
        dest.writeString(this.f66108b);
        dest.writeSerializable(this.f66109c);
        List list = this.d;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = v0.a.q(dest, 1, list);
            while (itQ.hasNext()) {
                dest.writeSerializable((Serializable) itQ.next());
            }
        }
        dest.writeInt(this.e ? 1 : 0);
        dest.writeInt(this.f ? 1 : 0);
        dest.writeSerializable(this.f66110g);
        Iterator itV = p.a.v(this.f66111h, dest);
        while (itV.hasNext()) {
            dest.writeString(((c) itV.next()).name());
        }
        dest.writeInt(this.i ? 1 : 0);
        dest.writeInt(this.f66112j ? 1 : 0);
        dest.writeInt(this.k ? 1 : 0);
        dest.writeStringList(this.f66113l);
        dest.writeString(this.f66114m);
    }
}
