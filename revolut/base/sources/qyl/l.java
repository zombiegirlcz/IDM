package qyl;

import android.text.Editable;
import android.text.TextWatcher;
import com.revolut.uicomponent.card.ExternalCardView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class l implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ExternalCardView f250311a;

    public l(ExternalCardView externalCardView) {
        this.f250311a = externalCardView;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        i listener;
        if (editable == null || (listener = this.f250311a.getListener()) == null) {
            return;
        }
        String postcode = editable.toString();
        Intrinsics.checkNotNullParameter(postcode, "postcode");
        ((ihm.f) ((com.revolut.uicomponent.products.d) listener).f107223a.f.getValue()).onNext(postcode);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
