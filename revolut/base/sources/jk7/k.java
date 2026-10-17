package jk7;

import com.revolut.feature.insurance.impl.ui.cfac.claim.supporting_documents.CFACInsuranceSupportingDocumentsScreenContract$InputData;
import e60.s;
import java.util.List;
import jki.p;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends jki.g implements i {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e60.a f175118p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j60.a f175119q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final m f175120r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final n f175121s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final mj7.b f175122t;
    public final g u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(p stateMapper, CFACInsuranceSupportingDocumentsScreenContract$InputData inputData, e60.a mediaPickerControllerExtension, j60.a bottomExpandableDialogControllerExtension, m noAddedDocumentsBottomDialogProvider, n removeDocumentBottomDialogProvider, mj7.b claimCacheRepository) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(mediaPickerControllerExtension, "mediaPickerControllerExtension");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        Intrinsics.checkNotNullParameter(noAddedDocumentsBottomDialogProvider, "noAddedDocumentsBottomDialogProvider");
        Intrinsics.checkNotNullParameter(removeDocumentBottomDialogProvider, "removeDocumentBottomDialogProvider");
        Intrinsics.checkNotNullParameter(claimCacheRepository, "claimCacheRepository");
        this.f175118p = mediaPickerControllerExtension;
        this.f175119q = bottomExpandableDialogControllerExtension;
        this.f175120r = noAddedDocumentsBottomDialogProvider;
        this.f175121s = removeDocumentBottomDialogProvider;
        this.f175122t = claimCacheRepository;
        String str = inputData.f75116a;
        boolean z = inputData.f75118c;
        List list = z ? inputData.d : null;
        this.u = new g(str, list == null ? claimCacheRepository.a() : list, z);
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, rd0.e.b(((s) this.f175118p).f122868g), null, null, new jij.h(this, (Continuation) null, 7), 3);
    }

    @Override // yji.l
    public final void T1(long j2) {
        if (((g) t2()).f175115c) {
            return;
        }
        x2(new jeg.g(this, 28));
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.u;
    }
}
