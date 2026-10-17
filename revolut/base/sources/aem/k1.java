package aem;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class k1 extends kotlin.jvm.internal.a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k1 f3742a = new k1(0, j1.class, "<init>", "<init>(Ljava/lang/String;)V", 0);

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Intrinsics.checkNotNullParameter("Ktor http-client", "agent");
        j1 j1Var = new j1();
        j1Var.f3737a = "Ktor http-client";
        return j1Var;
    }
}
