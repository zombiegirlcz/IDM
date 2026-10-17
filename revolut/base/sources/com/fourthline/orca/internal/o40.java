package com.fourthline.orca.internal;

import com.fourthline.orca.internal.c81;
import com.fourthline.orca.internal.w2;
import com.fourthline.orca.internal.y20;
import com.fourthline.orca.internal.z20;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class o40 implements w20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f31560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p40 f31561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final m40 f31562c;
    private final n40 d;
    private final Function0 e;
    private final v10 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final w2 f31563g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final c81 f31564h;
    private final c81 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final c81 f31565j;
    private final c81 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final z10 f31566l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final p20 f31567m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private a01 f31568n;
    private z20 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private r2 f31569p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final z20.a f31570q;

    public o40(String identifier, p40 initialStateRepository, m40 resultRepository, n40 suggestionProvider, Function0 resourcesProvider, v10 imageServiceLocator, w2 validator, c81 title, c81 placeholder, c81 valueRequired, c81 valueInvalid, z10 imageSource, p20 analytics) {
        String str;
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(initialStateRepository, "initialStateRepository");
        Intrinsics.checkNotNullParameter(resultRepository, "resultRepository");
        Intrinsics.checkNotNullParameter(suggestionProvider, "suggestionProvider");
        Intrinsics.checkNotNullParameter(resourcesProvider, "resourcesProvider");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        Intrinsics.checkNotNullParameter(validator, "validator");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(placeholder, "placeholder");
        Intrinsics.checkNotNullParameter(valueRequired, "valueRequired");
        Intrinsics.checkNotNullParameter(valueInvalid, "valueInvalid");
        Intrinsics.checkNotNullParameter(imageSource, "imageSource");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        this.f31560a = identifier;
        this.f31561b = initialStateRepository;
        this.f31562c = resultRepository;
        this.d = suggestionProvider;
        this.e = resourcesProvider;
        this.f = imageServiceLocator;
        this.f31563g = validator;
        this.f31564h = title;
        this.i = placeholder;
        this.f31565j = valueRequired;
        this.k = valueInvalid;
        this.f31566l = imageSource;
        this.f31567m = analytics;
        a01 a01VarD = initialStateRepository.d();
        this.f31568n = a01VarD;
        if (a01VarD != null) {
            this.o = b(a01VarD);
            str = (String) a01VarD.a().invoke();
        } else {
            str = "";
        }
        r2 r2Var = new r2(null, identifier, false, title, placeholder, str, this.o instanceof z20.a ? l20.f30509c : l20.f30507a, a01VarD != null ? c81.a.a(c81.f27404a, R.string.shared_validation_captured_from_scan, 0, 2, null) : c81.b.f27406b, this.o instanceof z20.a ? imageServiceLocator.a(r10.E0) : null, null, null, imageSource, 1541, null);
        analytics.a(r2Var);
        this.f31569p = r2Var;
        this.f31570q = new z20.a(new y20.d());
    }

    private final z20 b(a01 a01Var) {
        z20 aVar;
        if (a01Var != null) {
            w2.a aVarA = this.f31563g.a(a01Var);
            if (aVarA instanceof w2.a.b) {
                aVar = z20.b.f35505a;
            } else {
                if (!(aVarA instanceof w2.a.C0303a)) {
                    throw new NoWhenBranchMatchedException();
                }
                w2.a.C0303a c0303a = (w2.a.C0303a) aVarA;
                aVar = new z20.a(c0303a.a() instanceof y20 ? (y20) c0303a.a() : new y20.d());
            }
            if (aVar != null) {
                return aVar;
            }
        }
        return this.f31570q;
    }

    private final z20 c(String str) {
        return str.length() == 0 ? new z20.a(new y20.c()) : new z20.a(new y20.d());
    }

    public final z20 a() {
        return this.o;
    }

    @Override // com.fourthline.orca.internal.w20
    public r2 getState() {
        return this.f31569p;
    }

    @Override // com.fourthline.orca.internal.w20
    public boolean isValid() {
        return this.o instanceof z20.b;
    }

    public void a(r2 r2Var) {
        Intrinsics.checkNotNullParameter(r2Var, "<set-?>");
        this.f31569p = r2Var;
    }

    public void a(a01 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        z20 z20VarB = b(item);
        this.o = z20VarB;
        if (z20VarB instanceof z20.b) {
            this.f31562c.a(item);
        }
        r2 r2VarA = r2.a(getState(), null, null, false, null, null, (String) item.a().invoke(), l20.f30507a, null, null, null, zhm.f0.f322471a, null, 2975, null);
        this.f31567m.b(r2VarA);
        a(r2VarA);
    }

    public void b(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        a(r2.a(getState(), null, null, false, null, null, value, null, null, null, null, this.d.a(value), null, 3039, null));
    }

    public void a(boolean z) {
        l20 l20Var;
        c81 c81Var;
        r2 r2VarA;
        List listA;
        boolean z3 = (z && getState().getState() != l20.f30508b) || !(z || getState().getState() == l20.f30507a);
        z20 z20VarC = this.o;
        if (z20VarC == null && z3 && !z) {
            z20VarC = c(getState().getText());
        }
        z20.a aVar = z20VarC instanceof z20.a ? (z20.a) z20VarC : null;
        y20 y20VarA = aVar != null ? aVar.a() : null;
        if (z) {
            String text = getState().getText();
            if ((y20VarA instanceof y20.b.C0314b) || (y20VarA instanceof y20.b.a) || this.f31561b.d() != null) {
                this.f31568n = null;
                this.o = null;
                this.f31562c.a(null);
                text = "";
            }
            String str = text;
            if (str.length() > 0) {
                listA = this.d.a(str);
            } else {
                listA = zhm.f0.f322471a;
            }
            r2VarA = r2.a(getState(), null, null, false, null, null, str, l20.f30508b, c81.b.f27406b, null, null, listA, null, 2591, null);
        } else {
            z10 z10VarA = null;
            r2 state = getState();
            if (y20VarA != null) {
                l20Var = l20.f30509c;
            } else {
                l20Var = l20.f30507a;
            }
            l20 l20Var2 = l20Var;
            if (y20VarA instanceof y20.c) {
                c81Var = this.f31565j;
            } else {
                c81Var = y20VarA instanceof y20.d ? this.k : c81.b.f27406b;
            }
            c81 c81Var2 = c81Var;
            if (y20VarA != null) {
                z10VarA = this.f.a(r10.E0);
            }
            r2VarA = r2.a(state, null, null, false, null, null, null, l20Var2, c81Var2, z10VarA, null, zhm.f0.f322471a, null, 2623, null);
        }
        a(r2VarA);
        if (z || !z3) {
            return;
        }
        this.f31567m.b(getState());
        if (y20VarA != null) {
            this.f31567m.a(getState(), y20VarA);
        }
    }

    public final a01 a(String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        List listA = this.d.a(input);
        if (listA.size() != 1) {
            return null;
        }
        a01 a01Var = (a01) zhm.d0.b0(listA);
        if (kotlin.text.a0.z(input, d81.a(a01Var.getName(), this.e), true)) {
            return a01Var;
        }
        return null;
    }
}
