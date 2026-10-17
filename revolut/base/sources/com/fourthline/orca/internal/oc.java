package com.fourthline.orca.internal;

import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class oc implements fb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final eb f31636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v9 f31637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f31638c;
    private final gj d;
    private String e;
    private String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private fd f31639g;

    public oc(eb contactBundle, v9 cellularManager, List countries, gj documentBundle) {
        fd fdVarD;
        Intrinsics.checkNotNullParameter(contactBundle, "contactBundle");
        Intrinsics.checkNotNullParameter(cellularManager, "cellularManager");
        Intrinsics.checkNotNullParameter(countries, "countries");
        Intrinsics.checkNotNullParameter(documentBundle, "documentBundle");
        this.f31636a = contactBundle;
        this.f31637b = cellularManager;
        this.f31638c = countries;
        this.d = documentBundle;
        if (d() == null && contactBundle.c() != null) {
            fdVarD = a();
        } else if (d() == null) {
            fd fdVarK = k();
            String strG = fdVarK.g();
            String strF = f();
            contactBundle.c(kotlin.text.d0.F0(strG + " " + (strF == null ? "" : strF)).toString());
            fdVarD = fdVarK;
        } else {
            fdVarD = d();
        }
        a(fdVarD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fd c(oc ocVar) {
        Object next;
        Iterator it8 = ocVar.b().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            String strA = ba.a(((fd) next).b());
            String country = Locale.getDefault().getCountry();
            Intrinsics.checkNotNullExpressionValue(country, "getCountry(...)");
            if (Intrinsics.f(strA, ba.a(country))) {
                break;
            }
        }
        return (fd) next;
    }

    private final fd k() {
        final int i = 0;
        Lazy lazyB = yhm.j.b(new Function0(this) { // from class: com.fourthline.orca.internal.mq1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ oc f31253b;

            {
                this.f31253b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return oc.a(this.f31253b);
                    case 1:
                        return oc.b(this.f31253b);
                    default:
                        return oc.c(this.f31253b);
                }
            }
        });
        final int i2 = 1;
        Lazy lazyB2 = yhm.j.b(new Function0(this) { // from class: com.fourthline.orca.internal.mq1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ oc f31253b;

            {
                this.f31253b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return oc.a(this.f31253b);
                    case 1:
                        return oc.b(this.f31253b);
                    default:
                        return oc.c(this.f31253b);
                }
            }
        });
        final int i3 = 2;
        Lazy lazyB3 = yhm.j.b(new Function0(this) { // from class: com.fourthline.orca.internal.mq1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ oc f31253b;

            {
                this.f31253b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return oc.a(this.f31253b);
                    case 1:
                        return oc.b(this.f31253b);
                    default:
                        return oc.c(this.f31253b);
                }
            }
        });
        fd fdVarB = b(lazyB2) != null ? b(lazyB2) : c(lazyB3) != null ? c(lazyB3) : this.d.g();
        return fdVarB == null ? a(lazyB) : fdVarB;
    }

    @Override // com.fourthline.orca.internal.fb
    public void a(String str) {
        String strG;
        eb ebVar = this.f31636a;
        fd fdVarD = d();
        if (fdVarD == null || (strG = fdVarD.g()) == null) {
            strG = "";
        }
        ebVar.c(kotlin.text.d0.F0(strG + " " + str).toString());
        this.f = str;
    }

    @Override // com.fourthline.orca.internal.fb
    public List b() {
        return this.f31638c;
    }

    @Override // com.fourthline.orca.internal.fb
    public String g() {
        return this.f31636a.a();
    }

    @Override // com.fourthline.orca.internal.fb
    public boolean h() {
        String strG = g();
        return strG == null || strG.length() == 0;
    }

    @Override // com.fourthline.orca.internal.fb
    public boolean i() {
        String strF;
        return e() && (strF = f()) != null && strF.length() != 0 && j();
    }

    @Override // com.fourthline.orca.internal.fb
    public boolean j() {
        return this.f31636a.d();
    }

    @Override // com.fourthline.orca.internal.fb
    public void b(String str) {
        this.f31636a.b(str);
        this.e = str;
    }

    @Override // com.fourthline.orca.internal.fb
    public fd d() {
        return this.f31639g;
    }

    @Override // com.fourthline.orca.internal.fb
    public boolean e() {
        return this.f31636a.b();
    }

    @Override // com.fourthline.orca.internal.fb
    public String f() {
        List listN0;
        String strC = this.f31636a.c();
        if (strC == null || (listN0 = kotlin.text.d0.n0(strC, new String[]{" "}, 0, 6)) == null) {
            return null;
        }
        return (String) zhm.d0.e0(1, listN0);
    }

    @Override // com.fourthline.orca.internal.fb
    public void a(fd fdVar) {
        String strG;
        eb ebVar = this.f31636a;
        if (fdVar == null || (strG = fdVar.g()) == null) {
            strG = "";
        }
        String strF = f();
        ebVar.c(kotlin.text.d0.F0(strG + " " + (strF != null ? strF : "")).toString());
        this.f31639g = fdVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fd b(oc ocVar) {
        Object obj2;
        Iterator it8 = ocVar.b().iterator();
        while (true) {
            if (!it8.hasNext()) {
                break;
            }
            Object next = it8.next();
            String strA = ba.a(((fd) next).b());
            String strA2 = ocVar.f31637b.a();
            if (Intrinsics.f(strA, strA2 != null ? ba.a(strA2) : null)) {
                obj2 = next;
                break;
            }
        }
        return (fd) obj2;
    }

    private final fd a() {
        List listN0;
        String strC = this.f31636a.c();
        Object obj2 = null;
        String str = (strC == null || (listN0 = kotlin.text.d0.n0(strC, new String[]{" "}, 0, 6)) == null) ? null : (String) zhm.d0.e0(0, listN0);
        Iterator it8 = b().iterator();
        while (true) {
            if (!it8.hasNext()) {
                break;
            }
            Object next = it8.next();
            if (Intrinsics.f(((fd) next).g(), str)) {
                obj2 = next;
                break;
            }
        }
        fd fdVar = (fd) obj2;
        if (fdVar != null) {
            return fdVar;
        }
        fd fdVarK = k();
        this.f31636a.c(fdVarK.g());
        return fdVarK;
    }

    private static final fd c(Lazy lazy) {
        return (fd) lazy.getValue();
    }

    @Override // com.fourthline.orca.internal.fb
    public boolean c() {
        String strF = f();
        return strF == null || strF.length() == 0;
    }

    private static final fd b(Lazy lazy) {
        return (fd) lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fd a(oc ocVar) {
        for (fd fdVar : ocVar.b()) {
            if (Intrinsics.f(fdVar.c(), "NLD")) {
                return fdVar;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    private static final fd a(Lazy lazy) {
        return (fd) lazy.getValue();
    }
}
