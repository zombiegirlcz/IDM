package com.revolut.core.ui_kit.models;

import au6.e2;
import com.revolut.core.ui_kit.models.MoneyClause;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public abstract class k0 {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final MoneyClause.Format.Defaults f58089b = new MoneyClause.Format.Defaults(null, null, false, false, 15);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final MoneyClause.Format.Shorts f58090c = new MoneyClause.Format.Shorts(false, 63);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e2 f58091a;

    public static final class a {
        private a() {
        }
    }

    public static final class b extends k0 {
        public static final b d = new b(0);

        private b() {
            super(0);
        }

        @Override // com.revolut.core.ui_kit.models.k0
        public final Function1 a() {
            return new e2(18);
        }
    }

    public static final class c extends k0 {
        public static final c d = new c(0);
        public static final e2 e = new e2(20);

        private c() {
            super(0);
        }

        @Override // com.revolut.core.ui_kit.models.k0
        public final Function1 a() {
            return new e2(19);
        }

        @Override // com.revolut.core.ui_kit.models.k0
        public final Function1 b() {
            return e;
        }
    }

    public static final class d extends k0 {
        public static final d d = new d(0);

        private d() {
            super(0);
        }

        @Override // com.revolut.core.ui_kit.models.k0
        public final Function1 a() {
            return new e2(21);
        }
    }

    public /* synthetic */ k0(int i) {
        this();
    }

    public abstract Function1 a();

    public Function1 b() {
        return this.f58091a;
    }

    private k0() {
        this.f58091a = new e2(17);
    }
}
