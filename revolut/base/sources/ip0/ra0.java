package ip0;

import android.view.View;
import com.revolut.core.ui_kit.views.AvatarView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class ra0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f166154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AvatarView f166155b;

    public /* synthetic */ ra0(AvatarView avatarView, int i) {
        this.f166154a = i;
        this.f166155b = avatarView;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f166154a;
        AvatarView avatarView = this.f166155b;
        switch (i) {
            case 0:
                return avatarView;
            case 1:
                return AvatarView.f0(avatarView);
            case 2:
                ?? r06 = avatarView.o;
                Intrinsics.checkNotNullParameter(r06, "<this>");
                return (View) (r06.isInitialized() ? r06.getValue() : null);
            case 3:
                AvatarView.Companion companion = AvatarView.INSTANCE;
                return new ix0.l0(avatarView, avatarView.q0());
            case 4:
                return avatarView.f;
            case 5:
                AvatarView.Companion companion2 = AvatarView.INSTANCE;
                return new ix0.l0(avatarView, zhm.f0.f322471a);
            default:
                return AvatarView.g0(avatarView);
        }
    }
}
