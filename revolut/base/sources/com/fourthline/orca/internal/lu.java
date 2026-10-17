package com.fourthline.orca.internal;

import com.fourthline.orca.internal.bu;
import com.fourthline.orca.internal.c81;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class lu implements j20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bu f30752a;

    public lu() {
        c81.a aVar = c81.f27404a;
        this.f30752a = new bu(c81.a.a(aVar, R.string.step_eid_pin_header_germany, 0, 2, null), c81.a.a(aVar, R.string.step_eid_pin_message_germany, 0, 2, null), c81.a.a(aVar, R.string.step_eid_pin_label, 0, 2, null), new bu.a(c81.a.a(aVar, R.string.step_eid_pin_hint_germany, 0, 2, null), "AusweisApp"), false, new bu.b(c81.a.a(aVar, R.string.step_document_type_footer_document_not_accepted, 0, 2, null), c81.a.a(aVar, R.string.shared_button_choose_another_verification_type, 0, 2, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bu a(bu buVar) {
        Intrinsics.checkNotNullParameter(buVar, "<this>");
        return bu.a(buVar, null, null, null, null, false, null, 47, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bu b(bu buVar) {
        Intrinsics.checkNotNullParameter(buVar, "<this>");
        return bu.a(buVar, null, null, null, null, true, null, 47, null);
    }

    public final Function1 k() {
        return new jm1(24);
    }

    public final Function1 s() {
        return new jm1(23);
    }

    @Override // com.fourthline.orca.internal.j20
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public bu getInitialState() {
        return this.f30752a;
    }
}
