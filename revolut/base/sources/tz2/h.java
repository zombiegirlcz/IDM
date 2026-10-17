package tz2;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.card_management.impl.ui.kompot.replace.reason.CardReplaceReasonPickerContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class h implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardReplaceReasonPickerContract$InputData f275778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f275779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f275780c;
    public final e4m.e d;

    public h(e eVar, g gVar, CardReplaceReasonPickerContract$InputData cardReplaceReasonPickerContract$InputData) {
        this.f275779b = eVar;
        this.f275778a = cardReplaceReasonPickerContract$InputData;
        int i = 19;
        this.f275780c = e4m.b.b(new tg5.h(eVar, this, 1, i));
        this.d = e4m.b.b(new tg5.h(eVar, this, 0, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
