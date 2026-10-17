package gch;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f142486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j60.a f142487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f142488c;

    public m(l dialogMapper, j60.a expandableDialogControllerExtension, e delegatesProvider) {
        Intrinsics.checkNotNullParameter(dialogMapper, "dialogMapper");
        Intrinsics.checkNotNullParameter(expandableDialogControllerExtension, "expandableDialogControllerExtension");
        Intrinsics.checkNotNullParameter(delegatesProvider, "delegatesProvider");
        this.f142486a = dialogMapper;
        this.f142487b = expandableDialogControllerExtension;
        this.f142488c = delegatesProvider;
    }
}
