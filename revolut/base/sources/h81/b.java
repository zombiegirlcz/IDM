package h81;

import a0.d;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import f01.c;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import zhm.h0;

/* JADX INFO: loaded from: classes20.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f149938a;

    public b(c uiKitResources) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f149938a = uiKitResources;
    }

    public final TextLocalisedClause a(int i, String str) {
        if (i > 1) {
            String strV = d.v(new Object[]{Integer.valueOf(i)}, 1, str, "format(...)");
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(strV, (List) null, (Clause) null, true, 14);
            try {
                if (!d0.W(this.f149938a.b(textLocalisedClause))) {
                    return textLocalisedClause;
                }
            } catch (Exception e) {
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "ErrorMessagesProvider", "getLocalizedMessage for key '" + strV + "' failed: " + e, null, h0Var);
            }
        }
        return null;
    }
}
