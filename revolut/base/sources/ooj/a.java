package ooj;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UserAvatarImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UserNamePlaceholder;
import com.revolut.core.ui_kit_core.displayers.video.models.UrlVideo;
import com.revolut.retail.feature.event_appearance.impl.R$string;
import com.revolut.shared.feature.event_appearance.api.models.WelcomeAppearance;
import com.youTransactor.uCube.rpc.Constants;
import java.util.concurrent.Callable;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class a implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f227132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p7l.a f227133b;

    public /* synthetic */ a(c cVar, p7l.a aVar) {
        this.f227132a = 0;
        this.f227133b = aVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f227132a) {
            case 0:
                p7l.a aVar = this.f227133b;
                String str = aVar.f233790a;
                if (str == null || str.length() <= 0) {
                    str = null;
                }
                return new WelcomeAppearance(str != null ? new TextLocalisedClause(R$string.event_appearance_birthday_welcome_happy_birthday_default, u.c(str), null, 12) : new TextLocalisedClause(R$string.event_appearance_birthday_welcome_happy_birthday_fallback, null, null, 14), toj.b.a(aVar), (UrlVideo) null);
            case 1:
                String str2 = this.f227133b.f233790a;
                return new WelcomeAppearance(str2 != null ? new TextLocalisedClause(R$string.event_appearance_halloween_welcome_happy, u.c(str2), null, 12) : new TextLocalisedClause(R$string.event_appearance_regular_welcome_enter_passcode, null, null, 14), new CdnImage("halloween_pumpkin", "mobile/easter_eggs/images", null, null, null, null, Constants.TAG_OS_VERSION), (UrlVideo) null);
            default:
                p7l.a aVar2 = this.f227133b;
                String str3 = aVar2.f233790a;
                return new WelcomeAppearance(str3 != null ? new TextLocalisedClause(R$string.event_appearance_lunar_welcome_happy_lunar_new_year, u.c(str3), null, 12) : new TextLocalisedClause(R$string.event_appearance_regular_welcome_enter_passcode, null, null, 14), new UserAvatarImage(new UserNamePlaceholder.Default(mo3.a.k(aVar2), 0), null, null, 6), (UrlVideo) null);
        }
    }

    public /* synthetic */ a(p7l.a aVar, int i) {
        this.f227132a = i;
        this.f227133b = aVar;
    }
}
