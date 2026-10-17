package alf;

import elf.s0;
import klf.h0;
import klf.m1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements s0 {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f6260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m1 f6261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wwa.b f6262c;
    public final lg0.b d;

    public c(h0 commonDataSource, m1 juniorDataSource, wwa.b inviteCampaignHomeInteractor, lg0.b deeplinkHandler) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(juniorDataSource, "juniorDataSource");
        Intrinsics.checkNotNullParameter(inviteCampaignHomeInteractor, "inviteCampaignHomeInteractor");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        this.f6260a = commonDataSource;
        this.f6261b = juniorDataSource;
        this.f6262c = inviteCampaignHomeInteractor;
        this.d = deeplinkHandler;
    }

    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        if (!Intrinsics.f(str, "SALARY_BANNER_LEARN_MORE_LIST_ID")) {
            return Boolean.FALSE;
        }
        Intrinsics.i(obj2, "null cannot be cast to non-null type kotlin.String");
        return lg0.b.x1(this.d, (String) obj2, null, null, continuation, 6);
    }
}
