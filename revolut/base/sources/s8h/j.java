package s8h;

import android.text.SpannableString;
import android.text.util.Linkify;
import ch.qos.logback.core.util.FileSize;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.feature.event_appearance.impl.R$string;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class j implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f261013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f261014b;

    public /* synthetic */ j(String str, int i) {
        this.f261013a = i;
        this.f261014b = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f261013a) {
            case 0:
                String str = this.f261014b;
                if (str.length() <= 0) {
                    str = null;
                }
                if (str != null) {
                    return str;
                }
                throw new IllegalStateException("Compound id is not provided");
            case 1:
                od0.h hVar = od0.i.Companion;
                d.Companion.getClass();
                d dVarA = c.a(this.f261014b);
                hVar.getClass();
                return od0.h.a(dVarA);
            case 2:
                return new TextLocalisedClause(R$string.event_appearance_pride_welcome_happy, zhm.u.c(this.f261014b), null, 12);
            default:
                String str2 = this.f261014b;
                return m70.a.s(str2) > FileSize.KB_COEFFICIENT ? iu9.c.CHARACTER_LIMIT_EXCEED : (kotlin.text.d0.W(str2) || !Linkify.addLinks(new SpannableString(str2), 1)) ? iu9.c.VALID : iu9.c.CONTAINS_LINKS;
        }
    }

    public /* synthetic */ j(zu9.c cVar, String str) {
        this.f261013a = 3;
        this.f261014b = str;
    }
}
