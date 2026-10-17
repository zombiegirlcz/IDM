package lza;

import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import mza.d;
import mza.e;
import mza.f;
import mza.h;
import oza.c;
import oza.g;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes13.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f200955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f200956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f200957c;

    static {
        mza.a aVar = mza.a.HORIZONTAL;
        mza.b bVar = mza.b.DARK;
        f200955a = new h(aVar, bVar);
        f200956b = r0.k(new Pair("vertical", mza.a.VERTICAL), new Pair("horizontal", aVar));
        f200957c = r0.k(new Pair("dark", bVar), new Pair("light", mza.b.LIGHT));
    }

    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.Object, java.util.Map] */
    public static final d a(oza.d dVar) {
        h hVar;
        mza.b bVar;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        c content = dVar.getContent();
        Intrinsics.checkNotNullParameter(content, "<this>");
        String header = content.getHeader();
        String defaultRedirectUrl = content.getDefaultRedirectUrl();
        if (defaultRedirectUrl == null) {
            defaultRedirectUrl = "";
        }
        f fVar = new f(header, defaultRedirectUrl);
        List<oza.f> screens = dVar.getScreens();
        ArrayList arrayList = new ArrayList(w.t(screens, 10));
        for (oza.f fVar2 : screens) {
            Intrinsics.checkNotNullParameter(fVar2, "<this>");
            String title = fVar2.getTitle();
            String text = fVar2.getText();
            String backgroundMedia = fVar2.getBackgroundMedia();
            List<oza.a> buttons = fVar2.getButtons();
            ArrayList arrayList2 = new ArrayList(w.t(buttons, 10));
            for (oza.a aVar : buttons) {
                Intrinsics.checkNotNullParameter(aVar, "<this>");
                arrayList2.add(new e(aVar.getId(), aVar.getLabel(), aVar.getDeeplink()));
            }
            g style = fVar2.getStyle();
            if (style != null) {
                Intrinsics.checkNotNullParameter(style, "<this>");
                mza.a aVar2 = (mza.a) u1.u(style.getButtonOrientation(), f200956b);
                if (style.getDefaultColorScheme() == null || (bVar = (mza.b) u1.v(style.getDefaultColorScheme(), f200957c)) == null) {
                    bVar = mza.b.DARK;
                }
                hVar = new h(aVar2, bVar);
            } else {
                hVar = f200955a;
            }
            arrayList.add(new mza.g(title, text, backgroundMedia, arrayList2, hVar));
        }
        return new d(fVar, arrayList);
    }
}
