package l9k;

import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerReviewScreenInputData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class n implements cli.n {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PeerToPeerReviewScreenInputData f193283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yof.k f193284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jpc.e f193285c;
    public final vrf.h d;

    public n(PeerToPeerReviewScreenInputData inputData, yof.k transferReviewMapper, jpc.e feesMapper, vrf.h sectionFactory) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(transferReviewMapper, "transferReviewMapper");
        Intrinsics.checkNotNullParameter(feesMapper, "feesMapper");
        Intrinsics.checkNotNullParameter(sectionFactory, "sectionFactory");
        this.f193283a = inputData;
        this.f193284b = transferReviewMapper;
        this.f193285c = feesMapper;
        this.d = sectionFactory;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    @Override // cli.n
    public final cli.o c(cli.j r71) {
        /*
            Method dump skipped, instruction units count: 1174
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l9k.n.c(cli.j):cli.o");
    }
}
