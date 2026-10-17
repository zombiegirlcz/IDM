package com.fourthline.orca.internal;

import com.fourthline.orca.internal.c81;
import com.fourthline.orca.internal.m80;
import com.fourthline.orca.internal.qe0;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ve0 implements j20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final se0 f34347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p70 f34348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final v10 f34349c;

    public ve0(se0 repository, p70 nfcIntroLottieSource, v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(nfcIntroLottieSource, "nfcIntroLottieSource");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        this.f34347a = repository;
        this.f34348b = nfcIntroLottieSource;
        this.f34349c = imageServiceLocator;
    }

    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [com.fourthline.orca.internal.a9, java.lang.Object, kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r8v5 */
    @Override // com.fourthline.orca.internal.j20
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public qe0 getInitialState() {
        qe0.c cVar;
        ?? r87;
        c81.a aVar = c81.f27404a;
        c81.d dVarA = c81.a.a(aVar, R.string.step_document_nfc_intro_header_centric, 0, 2, null);
        qe0.a.C0273a c0273a = new qe0.a.C0273a(this.f34348b, c81.a.a(aVar, R.string.step_document_nfc_intro_title, 0, 2, null), c81.a.a(aVar, R.string.step_document_nfc_intro_message, 0, 2, null));
        m80.b bVar = new m80.b(c81.a.a(aVar, R.string.step_document_nfc_intro_button_start_nfc_scan, 0, 2, null));
        if (this.f34347a.f()) {
            cVar = new qe0.c(c81.a.a(aVar, R.string.step_document_nfc_intro_footer_how_to_scan, 0, 2, null), c81.a.a(aVar, R.string.shared_button_skip_nfc, 0, 2, null));
            r87 = 0;
        } else {
            cVar = null;
            r87 = 0;
        }
        return new qe0(dVarA, c0273a, bVar, cVar, new m80.a.C0250a(r87, 1, r87), new qe0.b(this.f34349c.a(r10.C0), c81.a.a(aVar, R.string.shared_hint_nfc_instructions, 0, 2, r87)));
    }
}
