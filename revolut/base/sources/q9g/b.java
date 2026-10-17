package q9g;

import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kg.r;
import kg.s;
import kg.t;
import kg.u;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f243893a;

    public b(Class baseType) {
        Intrinsics.checkNotNullParameter(baseType, "baseType");
        this.f243893a = baseType;
    }

    @Override // kg.t
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List deserialize(u json, Type typeOfT, s context) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(typeOfT, "typeOfT");
        Intrinsics.checkNotNullParameter(context, "context");
        ArrayList arrayList = new ArrayList();
        json.getClass();
        if (json instanceof r) {
            Iterator it8 = json.b().f183889a.iterator();
            Intrinsics.checkNotNullExpressionValue(it8, "iterator(...)");
            while (it8.hasNext()) {
                u uVar = (u) it8.next();
                try {
                    Object objD = ((a31.a) context).d(uVar, this.f243893a);
                    if (objD != null) {
                        arrayList.add(objD);
                    }
                } catch (JsonParseException e) {
                    String simpleName = b.class.getSimpleName();
                    Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Skipping unknown or malformed type: " + uVar, e);
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, simpleName, null, illegalArgumentException, h0Var);
                }
            }
        }
        return arrayList;
    }
}
