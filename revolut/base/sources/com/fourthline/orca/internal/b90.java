package com.fourthline.orca.internal;

import com.fourthline.core.DocumentType;
import java.util.Calendar;
import java.util.Date;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class b90 implements b31 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f27057b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f27058c = 8;
    private static final Calendar d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final gh f27059a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2031, 7, 30, 0, 0);
        Intrinsics.checkNotNullExpressionValue(calendar, "apply(...)");
        d = calendar;
    }

    public b90(gh document) {
        Intrinsics.checkNotNullParameter(document, "document");
        this.f27059a = document;
    }

    @Override // com.fourthline.orca.internal.b31
    public boolean a(fd fdVar, x71 taxationCountry, DocumentType documentType) {
        Intrinsics.checkNotNullParameter(taxationCountry, "taxationCountry");
        Date dateC = this.f27059a.c();
        if (dateC == null) {
            return false;
        }
        if (documentType != DocumentType.PASSPORT) {
            return true;
        }
        if (Intrinsics.f(fdVar != null ? fdVar.c() : null, taxationCountry.d())) {
            return dateC.before(d.getTime());
        }
        return true;
    }
}
