package a5k;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class b0 {

    @NotNull
    public static final z Companion = new z();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cpf.b f1436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sw8.a f1437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sf0.h f1438c;

    public b0(cpf.b transferResultDialogFactory, sw8.a jpMyNumberKycStatusFactory, sf0.h serverErrorParser) {
        Intrinsics.checkNotNullParameter(transferResultDialogFactory, "transferResultDialogFactory");
        Intrinsics.checkNotNullParameter(jpMyNumberKycStatusFactory, "jpMyNumberKycStatusFactory");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        this.f1436a = transferResultDialogFactory;
        this.f1437b = jpMyNumberKycStatusFactory;
        this.f1438c = serverErrorParser;
    }
}
