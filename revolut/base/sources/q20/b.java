package q20;

import aii.s;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.lifecycle.Lifecycle;
import com.revolut.chat_core.R$string;
import com.revolut.core.ui_kit_resources.R$drawable;
import ipa.h;
import ipa.i;
import ipa.j;
import ipa.k;
import ipa.l;
import java.util.Collection;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import rd0.d;
import ukm.f;
import v30.a0;
import v30.c0;
import vkm.q;
import vkm.z1;
import yk0.c;
import zhm.h0;

/* JADX INFO: loaded from: classes19.dex */
public final class b implements a40.b {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c40.b f241480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f241481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z70.a f241482c;
    public final s70.a d;
    public final Lifecycle e;
    public final z1 f;

    public b(c40.b chatScreenVisibilityObserver, c pushMessageHandlerProvider, z70.a contextProvider, s70.a intentProvider, Lifecycle lifecycle) {
        Intrinsics.checkNotNullParameter(chatScreenVisibilityObserver, "chatScreenVisibilityObserver");
        Intrinsics.checkNotNullParameter(pushMessageHandlerProvider, "pushMessageHandlerProvider");
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(intentProvider, "intentProvider");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        this.f241480a = chatScreenVisibilityObserver;
        this.f241481b = pushMessageHandlerProvider;
        this.f241482c = contextProvider;
        this.d = intentProvider;
        this.e = lifecycle;
        this.f = q.b(1, 1, f.DROP_OLDEST);
    }

    public static UUID c(String str) {
        if (str == null) {
            return null;
        }
        try {
            return UUID.fromString(str);
        } catch (IllegalArgumentException e) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
            d.a(rd0.c.ERROR, null, null, e, h0Var);
            return null;
        }
    }

    public final void a(j jVar, String str, String str2, String str3) {
        b90.a aVar = (b90.a) this.f241481b.get();
        String strH = k.h(jVar);
        if (strH == null) {
            strH = j6.a.p("toString(...)");
        }
        String str4 = (String) jVar.get("feedId");
        if (str4 == null && (str4 = (String) jVar.get("ticketId")) == null) {
            str4 = "";
        }
        h hVarL = k.l(jVar);
        z70.a aVar2 = this.f241482c;
        String string = aVar2.getContext().getString(R$string.chat_new_inbox_screen_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        l lVar = l.HIGH;
        i iVar = new i("chat", string, lVar);
        int i = R$drawable.uikit_icn_24_logo_revolut_colour;
        Context context = aVar2.getContext();
        int iHashCode = jVar.f167702a.hashCode();
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str3)).setPackage(aVar2.getContext().getPackageName());
        Intrinsics.checkNotNullExpressionValue(intent, "setPackage(...)");
        aVar.b(new ipa.b(strH, str4, hVarL, iVar, str, str2, i, null, new ipa.f(((s70.b) this.d).g(context, iHashCode, intent, 1140850688, 4)), lVar, 4992));
    }

    @Override // hpa.a
    public final boolean b(j message) {
        c0 c0VarA;
        Intrinsics.checkNotNullParameter(message, "message");
        String str = (String) message.get("serviceIdentifier");
        if (!Intrinsics.f(str, "revolut-chat") && !Intrinsics.f(str, "revolut-chat-assistant")) {
            return false;
        }
        UUID uuidC = c((String) message.get("ticketId"));
        UUID uuidC2 = c((String) message.get("feedId"));
        UUID uuidC3 = c((String) message.get("messageId"));
        String str2 = (String) message.get("feedType");
        if (str2 != null) {
            c0.Companion.getClass();
            c0VarA = a0.a(str2);
        } else {
            c0VarA = null;
        }
        if (uuidC != null) {
            this.f.k(new y30.a(uuidC2, uuidC, uuidC3, c0VarA));
        }
        String strO = k.o(message);
        String strI = k.i(message);
        String strE = k.e(message);
        if (strO != null && !d0.W(strO) && strI != null && !d0.W(strI) && strE != null && !d0.W(strE)) {
            if (!this.e.getState().isAtLeast(Lifecycle.State.STARTED)) {
                a(message, strO, strI, strE);
                return true;
            }
            if (c0VarA != c0.ASSISTANT) {
                Collection collectionValues = this.f241480a.f20971a.values();
                Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
                Collection<a40.a> collection = collectionValues;
                if (collection.isEmpty()) {
                    a(message, strO, strI, strE);
                } else {
                    for (a40.a aVar : collection) {
                        if (aVar.d == s.SHOWN && ((uuidC2 != null && Intrinsics.f(aVar.f1184b, uuidC2)) || (c0VarA != null && aVar.f1185c == c0VarA))) {
                            break;
                        }
                    }
                    a(message, strO, strI, strE);
                }
            }
        }
        return true;
    }
}
