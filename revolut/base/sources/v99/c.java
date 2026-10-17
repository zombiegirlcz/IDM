package v99;

import android.app.Activity;
import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rch.o;
import sri.m;
import yhm.j;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends fsi.c implements qf0.a {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Activity f287007h;
    public final qf0.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f f287008j;
    public final m k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f287009l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Lazy f287010m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Activity activity, qf0.c exceptionsOverseer, f guardianLogic, m navigator) {
        super(new fsi.b("EXCHANGE_GLOBAL_ACCESS_GUARDIAN"));
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(exceptionsOverseer, "exceptionsOverseer");
        Intrinsics.checkNotNullParameter(guardianLogic, "guardianLogic");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f287007h = activity;
        this.i = exceptionsOverseer;
        this.f287008j = guardianLogic;
        this.k = navigator;
        this.f287010m = j.b(new ur2.a(this, 26));
    }

    @Override // qf0.a
    public final Object P(Exception exc2, Continuation continuation) {
        return this.f287008j.a(exc2, new o(2, this, c.class, "awaitGlobalAccessFlow", "awaitGlobalAccessFlow(Lcom/revolut/feature/product_catalogue/api/State;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 16), (gim.c) continuation);
    }

    @Override // fsi.a
    public final void onStart() {
        boolean z = this.f287007h.getCallingActivity() == null;
        this.f287009l = z;
        if (z) {
            this.i.b(this);
        }
    }

    @Override // fsi.c, fsi.a
    public final void onStop() {
        super.onStop();
        if (this.f287009l) {
            this.i.a(this);
        }
    }
}
