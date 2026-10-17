package com.fourthline.orca.internal;

import com.fourthline.orca.internal.lz;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonObject;
import yhm.m;

/* JADX INFO: loaded from: classes23.dex */
public final class iq implements lz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function0 f29669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function0 f29670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final dj f29671c;

    public iq(Function0 nfcSupportedUseCase, Function0 nfcCanFlowUseCase, dj documentFlowConfig) {
        Intrinsics.checkNotNullParameter(nfcSupportedUseCase, "nfcSupportedUseCase");
        Intrinsics.checkNotNullParameter(nfcCanFlowUseCase, "nfcCanFlowUseCase");
        Intrinsics.checkNotNullParameter(documentFlowConfig, "documentFlowConfig");
        this.f29669a = nfcSupportedUseCase;
        this.f29670b = nfcCanFlowUseCase;
        this.f29671c = documentFlowConfig;
    }

    @Override // com.fourthline.orca.internal.lz
    public Object a(lz.a aVar, Continuation continuation) {
        lz.c.C0245c c0245c;
        m.Companion companion = yhm.m.INSTANCE;
        if (((Boolean) this.f29670b.invoke()).booleanValue() && ((Boolean) this.f29669a.invoke()).booleanValue()) {
            c0245c = new lz.c.C0245c("nfc_can", new xb0(this.f29671c.getDocumentStrategy(), this.f29671c.getTiltedStepsEnabled(), this.f29671c.getImageCapture(), this.f29671c.getVideo(), this.f29671c.getConfirmation(), this.f29671c.getIb.b.Analysis java.lang.String(), this.f29671c.getNfc(), this.f29671c.getSupportedDocuments(), this.f29671c.getCameraX().getEnabled(), this.f29671c.getNfcX().getEnabled()));
        } else {
            iz izVar = this.f29671c.getDocumentStrategy().a(wk.f34723a.e()) ? new iz((List) null, (JsonObject) null, 3, (DefaultConstructorMarker) null) : this.f29671c.getDocumentStrategy();
            c0245c = new lz.c.C0245c("document", new qo(izVar, this.f29671c.getTiltedStepsEnabled(), this.f29671c.getConfirmation(), this.f29671c.getImageCapture(), this.f29671c.getVideo(), this.f29671c.getIb.b.Analysis java.lang.String(), this.f29671c.getNfc(), this.f29671c.getSupportedDocuments(), this.f29671c.getCameraX().getEnabled(), this.f29671c.getNfcX().getEnabled()));
        }
        return new lz.b(c0245c);
    }
}
