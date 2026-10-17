package gyi;

import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.views.ProfileCardView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class r extends RecyclerView.ViewHolder {
    public final ProfileCardView e;
    public final Function0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Function1 f147904g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ifm.b f147905h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(ProfileCardView profileCardView, a76.c onErrorButtonClick, gwc.h onActionItemClick) {
        super(profileCardView);
        Intrinsics.checkNotNullParameter(profileCardView, "profileCardView");
        Intrinsics.checkNotNullParameter(onErrorButtonClick, "onErrorButtonClick");
        Intrinsics.checkNotNullParameter(onActionItemClick, "onActionItemClick");
        this.e = profileCardView;
        this.f = onErrorButtonClick;
        this.f147904g = onActionItemClick;
        this.f147905h = new ifm.b();
    }
}
