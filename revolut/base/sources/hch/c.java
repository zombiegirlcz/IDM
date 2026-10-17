package hch;

import com.revolut.feature.wealth.models.addmoney.TransferSubjectId;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import m1h.l;
import m1h.m;
import m1h.n;
import m1h.o;
import m1h.p;
import m1h.q;
import m1h.r;
import m1h.s;
import m1h.t;
import od0.i;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f150891a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0866c f150892b = new C0866c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f150893c = new b();
    public static final a d = new a();

    public static final class a implements l {
        @Override // m1h.l
        public final m a(TransferSubjectId transferSubjectId, t view, j60.a bottomExpandableDialogControllerExtension) {
            Intrinsics.checkNotNullParameter(transferSubjectId, "transferSubjectId");
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
            return new m(new hch.a(), new hch.b());
        }
    }

    public static final class b implements o {
        @Override // m1h.o
        public final p a(r state, s sVar, i tradingAccount) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
            return null;
        }
    }

    /* JADX INFO: renamed from: hch.c$c, reason: collision with other inner class name */
    public static final class C0866c implements q {
        @Override // m1h.q
        public final Flow a(TransferSubjectId transferSubjectId) {
            Intrinsics.checkNotNullParameter(transferSubjectId, "transferSubjectId");
            return vkm.i.f290039a;
        }
    }

    private c() {
    }

    @Override // m1h.n
    public final o a() {
        return f150893c;
    }

    @Override // m1h.n
    public final l b() {
        return d;
    }

    @Override // m1h.n
    public final q q() {
        return f150892b;
    }
}
