package com.fourthline.orca.internal;

import com.fourthline.orca.internal.c81;
import com.fourthline.orca.internal.m80;
import com.fourthline.orca.internal.qe0;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class xe0 implements j20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final se0 f34963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v10 f34964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ze0 f34965c;

    public xe0(se0 repository, v10 imageServiceLocator, ze0 instructionPageProvider) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        Intrinsics.checkNotNullParameter(instructionPageProvider, "instructionPageProvider");
        this.f34963a = repository;
        this.f34964b = imageServiceLocator;
        this.f34965c = instructionPageProvider;
    }

    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [com.fourthline.orca.internal.a9, java.lang.Object, kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r9v7 */
    @Override // com.fourthline.orca.internal.j20
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public qe0 getInitialState() {
        qe0.c cVar;
        ?? r92;
        c81.a aVar = c81.f27404a;
        c81.d dVarA = c81.a.a(aVar, R.string.step_document_nfc_intro_header_centric, 0, 2, null);
        qe0.a.b bVar = new qe0.a.b(this.f34965c.a(this.f34963a.a(), this.f34963a.b(), this.f34963a.d()), this.f34964b.a(r10.M0));
        m80.b bVar2 = new m80.b(c81.a.a(aVar, R.string.step_document_nfc_intro_button_start_nfc_scan, 0, 2, null));
        if (this.f34963a.f()) {
            cVar = new qe0.c(c81.a.a(aVar, R.string.step_document_nfc_intro_footer_how_to_scan, 0, 2, null), c81.a.a(aVar, R.string.shared_button_skip_nfc, 0, 2, null));
            r92 = 0;
        } else {
            cVar = null;
            r92 = 0;
        }
        return new qe0(dVarA, bVar, bVar2, cVar, new m80.a.C0250a(r92, 1, r92), new qe0.b(this.f34964b.a(r10.C0), c81.a.a(aVar, R.string.shared_hint_nfc_instructions, 0, 2, r92)));
    }
}
