package n50;

import com.revolut.chat.domain.model.ChatMode;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import java.util.List;
import k50.h1;
import kotlin.jvm.internal.Intrinsics;
import n33.l0;
import n4d.d0;

/* JADX INFO: loaded from: classes19.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j30.c f212477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z40.c f212478b;

    public d(j30.c featureToggles, z40.c chatExperienceRatingUiFactory) {
        Intrinsics.checkNotNullParameter(featureToggles, "featureToggles");
        Intrinsics.checkNotNullParameter(chatExperienceRatingUiFactory, "chatExperienceRatingUiFactory");
        this.f212477a = featureToggles;
        this.f212478b = chatExperienceRatingUiFactory;
    }

    public final h1 a(v30.j chat, ChatMode chatMode, Data chatRatingOptions) {
        Intrinsics.checkNotNullParameter(chat, "chat");
        Intrinsics.checkNotNullParameter(chatMode, "chatMode");
        Intrinsics.checkNotNullParameter(chatRatingOptions, "chatRatingOptions");
        List list = (List) iii.c.f(chatRatingOptions, new d0(3), new l0(13), new lk7.p(this, 4, chat, chatMode));
        yp0.b.k(list, 0, R$attr.uikit_dp16, 0, 0, 29);
        return new h1(list);
    }
}
