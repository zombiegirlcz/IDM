package ib;

import android.content.Context;
import android.util.Log;
import com.fourthline.core.internal.a0;
import f1m.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import z0m.q;
import z0m.x;
import zhm.d0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes23.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f160073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public x f160074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f160075c;
    public final a0 d;
    public final ArrayList e;
    public hb.b f;

    public h(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f160073a = context;
        this.f160075c = new LinkedHashMap();
        a0 a0Var = new a0();
        this.d = a0Var;
        this.e = new ArrayList();
        this.f = hb.b.NOT_GRANTED;
        c(a0Var);
        c(new com.fourthline.core.internal.a(context));
        c(new com.fourthline.core.internal.f());
    }

    public final void a(String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.f160075c.remove(identifier);
    }

    public final b b(String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        return (b) this.f160075c.get(identifier);
    }

    public final void c(b context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f160075c.put(context.getIdentifier(), context);
    }

    public final void d(String str) {
        String lowerCase;
        String strA = a0.a.f26292a.a();
        if (str != null) {
            lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        } else {
            lowerCase = null;
        }
        this.d.set(strA, lowerCase);
    }

    public final void e(f fVar, List list) {
        b bVarB;
        aim.f builder = new aim.f();
        builder.putAll(fVar.getAttributes());
        Intrinsics.checkNotNullParameter(builder, "builder");
        aim.f fVarB = builder.b();
        if (fVar.getSchema().length() > 0) {
            i event = new i(fVar.getSchema(), fVarB);
            ArrayList arrayList = new ArrayList(w.t(list, 10));
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                b bVar = (b) it8.next();
                if (Intrinsics.f(bVar.getIdentifier(), b.Workflow) && (bVarB = b(b.Workflow)) != null) {
                    bVar = bVarB;
                }
                arrayList.add(bVar);
            }
            ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                b bVar2 = (b) obj2;
                arrayList2.add(new h1m.a(bVar2.getSchema(), r0.u(bVar2.getData())));
            }
            event.f131307a.addAll(arrayList2);
            x xVar = this.f160074b;
            if (xVar != null) {
                Intrinsics.checkNotNullParameter(event, "event");
                q qVar = (q) xVar.f224673a;
                if (qVar.f318658b == null) {
                    Intrinsics.checkNotNullExpressionValue("x", "TAG");
                    Intrinsics.checkNotNullParameter("x", "tag");
                    Intrinsics.checkNotNullParameter("Recreating tracker instance after it was removed. This will not be supported in future versions.", "msg");
                    Log.e("x", "Recreating tracker instance after it was removed. This will not be supported in future versions.");
                }
                qVar.c().c(event);
            }
        }
    }

    public final void f(f event) {
        Intrinsics.checkNotNullParameter(event, "event");
        List listD1 = d0.d1(this.f160075c.values());
        if (this.f160074b != null && this.f == hb.b.GRANTED) {
            e(event, listD1);
        } else {
            this.e.add(new Pair(event, listD1));
        }
    }
}
