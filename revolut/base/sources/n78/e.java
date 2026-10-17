package n78;

import kotlin.jvm.internal.Intrinsics;
import te8.z;
import zf8.n;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hp8.b f213043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f213044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f213045c;

    public e(hp8.b tasksInteractor, z juniorProductsInteractor, n juniorAccountStatesProvider) {
        Intrinsics.checkNotNullParameter(tasksInteractor, "tasksInteractor");
        Intrinsics.checkNotNullParameter(juniorProductsInteractor, "juniorProductsInteractor");
        Intrinsics.checkNotNullParameter(juniorAccountStatesProvider, "juniorAccountStatesProvider");
        this.f213043a = tasksInteractor;
        this.f213044b = juniorProductsInteractor;
        this.f213045c = juniorAccountStatesProvider;
    }
}
