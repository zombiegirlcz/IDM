package x13;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.emoji_picker.CardPersonalisationEmojiPickerControllerContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class t implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardPersonalisationEmojiPickerControllerContract$InputData f302198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f302199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f302200c;
    public final e4m.e d;
    public final e4m.e e;

    public t(p pVar, q qVar, CardPersonalisationEmojiPickerControllerContract$InputData cardPersonalisationEmojiPickerControllerContract$InputData) {
        this.f302199b = pVar;
        this.f302200c = qVar;
        this.f302198a = cardPersonalisationEmojiPickerControllerContract$InputData;
        int i = 16;
        this.d = e4m.b.b(new vy9.a(this, 1, i));
        this.e = e4m.b.b(new vy9.a(this, 0, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f302199b.V.get(), (yji.n) this.f302200c.f302183r.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
