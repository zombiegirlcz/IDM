package srh;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.web_sign_in.ui.screen.confirmation.WebSignInConfirmationScreenContract$InputData;
import java.util.Set;
import r7d.w;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WebSignInConfirmationScreenContract$InputData f265219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f265220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f265221c;

    public c(b bVar, d dVar, WebSignInConfirmationScreenContract$InputData webSignInConfirmationScreenContract$InputData) {
        this.f265219a = webSignInConfirmationScreenContract$InputData;
        this.f265220b = e4m.b.b(new w(bVar, dVar, this, 1, 7));
        this.f265221c = e4m.b.b(new w(bVar, dVar, this, 0, 7));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of();
    }
}
