package pd1;

import android.graphics.Color;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.h0;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
public final class c implements a {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f235037b = v.k(Integer.valueOf(R$attr.uikit_colorDeepGrey), Integer.valueOf(R$attr.uikit_colorAccent), Integer.valueOf(R$attr.uikit_colorPink), Integer.valueOf(R$attr.uikit_colorGreen), Integer.valueOf(R$attr.uikit_colorOrange), Integer.valueOf(R$attr.uikit_colorRed), Integer.valueOf(R$attr.uikit_colorTerracotta), Integer.valueOf(R$attr.uikit_colorYellow), Integer.valueOf(R$attr.uikit_colorLightGreen), Integer.valueOf(R$attr.uikit_colorCyan), Integer.valueOf(R$attr.uikit_colorLightBlue), Integer.valueOf(R$attr.uikit_colorDeepPurple), Integer.valueOf(R$attr.uikit_colorPurple), Integer.valueOf(R$attr.uikit_colorBrown), Integer.valueOf(R$attr.uikit_colorGrey50), Integer.valueOf(R$attr.uikit_colorBlack));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c90.c f235038a;

    public c(c90.c uiResources) {
        Intrinsics.checkNotNullParameter(uiResources, "uiResources");
        this.f235038a = uiResources;
    }

    public final String a(int i) {
        return d(kli.a.s(i, this.f235038a.f22265a));
    }

    public final List b(String initialColor) {
        Object next;
        Intrinsics.checkNotNullParameter(initialColor, "initialColor");
        List list = f235037b;
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (a(((Number) next).intValue()).equals(initialColor)) {
                break;
            }
        }
        Integer num = (Integer) next;
        if (num == null) {
            return list;
        }
        ArrayList arrayListF1 = d0.f1(list);
        arrayListF1.remove(num);
        arrayListF1.add(0, num);
        return arrayListF1;
    }

    public final int c(String str) {
        List list = f235037b;
        c90.c cVar = this.f235038a;
        if (str == null) {
            return kli.a.s(((Number) d0.b0(list)).intValue(), cVar.f22265a);
        }
        try {
            return Color.parseColor("#".concat(str));
        } catch (Throwable th10) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, th10, h0Var);
            return kli.a.s(((Number) d0.b0(list)).intValue(), cVar.f22265a);
        }
    }

    public final String d(int i) {
        return a0.d.v(new Object[]{Integer.valueOf(i & 16777215)}, 1, "%06X", "format(...)");
    }
}
