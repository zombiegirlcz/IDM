package rp0;

import com.revolut.core.ui_kit.delegates.PromptContentDelegate;
import com.revolut.core.ui_kit.internal.dialogs.BottomExpandableDialogView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f256147a = new m(new BottomExpandableDialogView.b.C0433b(1));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PromptContentDelegate f256148b = new PromptContentDelegate();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f256149c;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f256150a;

        public a() {
            this(null);
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && Intrinsics.f(this.f256150a, ((a) obj2).f256150a);
        }

        public final int hashCode() {
            Object obj2 = this.f256150a;
            if (obj2 == null) {
                return 0;
            }
            return obj2.hashCode();
        }

        public a(Object obj2) {
            this.f256150a = obj2;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f256151a;

        public b() {
            this(null);
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof b) && Intrinsics.f(this.f256151a, ((b) obj2).f256151a);
        }

        public final int hashCode() {
            Object obj2 = this.f256151a;
            if (obj2 == null) {
                return 0;
            }
            return obj2.hashCode();
        }

        public b(Object obj2) {
            this.f256151a = obj2;
        }
    }

    public final void a() {
        this.f256147a.b(false);
    }

    public final efm.r b() {
        efm.r map = this.f256148b.q().map(new rof.e(18, new n0(2)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public final efm.r c() {
        efm.r map = this.f256148b.r().map(new rof.e(19, new n0(3)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public final efm.r d() {
        efm.r map = this.f256148b.f53054h.f121375b.map(new rof.e(23, new n0(5)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public final efm.r e() {
        efm.r map = this.f256147a.h().map(new rof.e(20, new n0(4)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public final efm.r f() {
        efm.r map = this.f256148b.i.f121375b.map(new rof.e(24, new n0(6)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(rp0.u0 r41) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rp0.p0.g(rp0.u0):void");
    }
}
