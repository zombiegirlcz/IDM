package zwj;

import android.net.Uri;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.sso.api.navigation.SignInWithRevolutIDDestination;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import lg0.g;
import org.jetbrains.annotations.NotNull;
import zhm.h0;
import zhm.y0;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements xii.b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f80.a f325966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f325967b;

    public b(f80.a uriHelper) {
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        this.f325966a = uriHelper;
        this.f325967b = y0.b("signin/revolutid");
    }

    @Override // xii.b
    public final Set a() {
        return this.f325967b;
    }

    @Override // xii.b
    public final ParcelableDestination e(lg0.e deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        LinkedHashMap linkedHashMap = deeplink.f195041c;
        String strA = g.a("client_id", linkedHashMap);
        if (strA == null || d0.W(strA)) {
            String name = b.class.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, name, "Deeplink doesn't have required query parameter client_id", null, h0Var);
            return null;
        }
        String strA2 = g.a("scope", linkedHashMap);
        if (strA2 == null || d0.W(strA2)) {
            String name2 = b.class.getName();
            Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
            h0 h0Var2 = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, name2, "Deeplink doesn't have required query parameter scope", null, h0Var2);
            return null;
        }
        String strA3 = g.a("code_challenge", linkedHashMap);
        if (strA3 == null || d0.W(strA3)) {
            String name3 = b.class.getName();
            Intrinsics.checkNotNullExpressionValue(name3, "getName(...)");
            h0 h0Var3 = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, name3, "Deeplink doesn't have required query parameter code_challenge", null, h0Var3);
            return null;
        }
        Uri uriG = ((f80.b) this.f325966a).g(g.a("redirect_uri", linkedHashMap));
        if (uriG != null && !uriG.equals(Uri.EMPTY)) {
            String string = uriG.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            if (!d0.W(string)) {
                String strA4 = g.a("state", linkedHashMap);
                if (strA4 != null && !d0.W(strA4)) {
                    String string2 = uriG.toString();
                    Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                    return new SignInWithRevolutIDDestination(strA, strA2, strA3, string2, strA4);
                }
                String name4 = b.class.getName();
                Intrinsics.checkNotNullExpressionValue(name4, "getName(...)");
                h0 h0Var4 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList4 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, name4, "Deeplink doesn't have required query parameter state", null, h0Var4);
                return null;
            }
        }
        String name5 = b.class.getName();
        Intrinsics.checkNotNullExpressionValue(name5, "getName(...)");
        h0 h0Var5 = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList5 = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, name5, "Deeplink doesn't have required query parameter redirect_uri", null, h0Var5);
        return null;
    }
}
