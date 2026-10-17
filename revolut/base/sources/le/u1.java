package le;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.google.firebase.components.DependencyCycleException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class u1 {
    public static final Optional a(Object obj2) {
        Optional optionalOfNullable = Optional.ofNullable(obj2);
        Intrinsics.checkNotNullExpressionValue(optionalOfNullable, "ofNullable(...)");
        return optionalOfNullable;
    }

    public static final mmm.k0 b(mmm.q0 q0Var) {
        Intrinsics.checkNotNullParameter(q0Var, "<this>");
        return new mmm.k0(q0Var);
    }

    public static final mmm.l0 c(mmm.s0 s0Var) {
        Intrinsics.checkNotNullParameter(s0Var, "<this>");
        return new mmm.l0(s0Var);
    }

    public static final efm.r d(efm.r a7, efm.r b4) {
        Intrinsics.checkNotNullParameter(a7, "a");
        Intrinsics.checkNotNullParameter(b4, "b");
        return kli.a.h(a7, b4);
    }

    public static final efm.r e(efm.r a7, efm.r b4, efm.r c2) {
        Intrinsics.checkNotNullParameter(a7, "a");
        Intrinsics.checkNotNullParameter(b4, "b");
        Intrinsics.checkNotNullParameter(c2, "c");
        return kli.a.i(a7, b4, c2);
    }

    public static void f(ArrayList arrayList) {
        HashMap map = new HashMap(arrayList.size());
        Iterator it8 = arrayList.iterator();
        while (true) {
            int i = 0;
            if (!it8.hasNext()) {
                Iterator it9 = map.values().iterator();
                while (it9.hasNext()) {
                    for (ce.l lVar : (Set) it9.next()) {
                        for (ce.n nVar : lVar.f23303a.f23285c) {
                            if (nVar.f23310c == 0) {
                                Set<ce.l> set = (Set) map.get(new ce.m(nVar.f23308a, nVar.f23309b == 2));
                                if (set != null) {
                                    for (ce.l lVar2 : set) {
                                        lVar.f23304b.add(lVar2);
                                        lVar2.f23305c.add(lVar);
                                    }
                                }
                            }
                        }
                    }
                }
                HashSet<ce.l> hashSet = new HashSet();
                Iterator it10 = map.values().iterator();
                while (it10.hasNext()) {
                    hashSet.addAll((Set) it10.next());
                }
                HashSet hashSet2 = new HashSet();
                for (ce.l lVar3 : hashSet) {
                    if (lVar3.f23305c.isEmpty()) {
                        hashSet2.add(lVar3);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    ce.l lVar4 = (ce.l) hashSet2.iterator().next();
                    hashSet2.remove(lVar4);
                    i++;
                    for (ce.l lVar5 : lVar4.f23304b) {
                        lVar5.f23305c.remove(lVar4);
                        if (lVar5.f23305c.isEmpty()) {
                            hashSet2.add(lVar5);
                        }
                    }
                }
                if (i == arrayList.size()) {
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                for (ce.l lVar6 : hashSet) {
                    if (!lVar6.f23305c.isEmpty() && !lVar6.f23304b.isEmpty()) {
                        arrayList2.add(lVar6.f23303a);
                    }
                }
                throw new DependencyCycleException(arrayList2);
            }
            ce.b bVar = (ce.b) it8.next();
            ce.l lVar7 = new ce.l(bVar);
            for (ce.t tVar : bVar.f23284b) {
                boolean z = bVar.e == 0;
                ce.m mVar = new ce.m(tVar, !z);
                if (!map.containsKey(mVar)) {
                    map.put(mVar, new HashSet());
                }
                Set set2 = (Set) map.get(mVar);
                if (!set2.isEmpty() && z) {
                    throw new IllegalArgumentException("Multiple components provide " + tVar + ".");
                }
                set2.add(lVar7);
            }
        }
    }

    public static final String g(Enum r3, Map mapping) {
        Object next;
        String str;
        Intrinsics.checkNotNullParameter(r3, "<this>");
        Intrinsics.checkNotNullParameter(mapping, "mapping");
        Iterator it8 = mapping.entrySet().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((Map.Entry) next).getValue(), r3)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null && (str = (String) entry.getKey()) != null) {
            return str;
        }
        throw new IllegalArgumentException("can't find key " + r3 + ", in mapping " + mapping);
    }

    public static final String h(Enum r3, Map mapping) {
        Object next;
        Intrinsics.checkNotNullParameter(r3, "<this>");
        Intrinsics.checkNotNullParameter(mapping, "mapping");
        Iterator it8 = mapping.entrySet().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((Map.Entry) next).getValue(), r3)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (String) entry.getKey();
        }
        return null;
    }

    public static final Object i(Class clazz, Set set) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        for (Object obj2 : set) {
            if (clazz.isInstance((fsi.a) obj2)) {
                return obj2;
            }
        }
        return null;
    }

    public static kg.d0 j(List list) {
        Iterator it8 = list.iterator();
        if (it8.hasNext()) {
            throw v0.a.e(it8);
        }
        return kg.d0.ALLOW;
    }

    public static String k(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb6 = new StringBuilder(str2.length() + str.length());
        for (int i = 0; i < str.length(); i++) {
            sb6.append(str.charAt(i));
            if (str2.length() > i) {
                sb6.append(str2.charAt(i));
            }
        }
        return sb6.toString();
    }

    public static final Object l(Optional optional) {
        Intrinsics.checkNotNullParameter(optional, "<this>");
        return optional.orElse(null);
    }

    public static l7.a m(q7.e eVar, d7.j jVar) {
        return new l7.a(p7.q.a(eVar, jVar, 1.0f, p7.f.f233473b, false), 0);
    }

    public static l7.b n(q7.d dVar, d7.j jVar, boolean z) {
        return new l7.b(p7.q.a(dVar, jVar, z ? r7.l.c() : 1.0f, p7.f.f233474c, false));
    }

    public static l7.a o(q7.e eVar, d7.j jVar) {
        return new l7.a(p7.q.a(eVar, jVar, 1.0f, p7.f.d, false), 1);
    }

    public static l7.c p(q7.e eVar, d7.j jVar) {
        return new l7.c(1, p7.q.a(eVar, jVar, r7.l.c(), p7.v.f233506a, true));
    }

    public static final mmm.d q(Socket socket) throws IOException {
        Intrinsics.checkNotNullParameter(socket, "<this>");
        nmm.k kVar = new nmm.k(socket);
        OutputStream outputStream = socket.getOutputStream();
        Intrinsics.checkNotNullExpressionValue(outputStream, "getOutputStream(...)");
        mmm.d sink = new mmm.d(outputStream, kVar);
        Intrinsics.checkNotNullParameter(sink, "sink");
        return new mmm.d(kVar, sink);
    }

    public static final mmm.e r(InputStream inputStream) {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        return new mmm.e(inputStream, new mmm.v0());
    }

    public static final mmm.e s(Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "<this>");
        nmm.k kVar = new nmm.k(socket);
        InputStream inputStream = socket.getInputStream();
        Intrinsics.checkNotNullExpressionValue(inputStream, "getInputStream(...)");
        mmm.e source = new mmm.e(inputStream, kVar);
        Intrinsics.checkNotNullParameter(source, "source");
        return new mmm.e(kVar, source);
    }

    public static final Object t(Object obj2, Object obj3, Map mapping) {
        Intrinsics.checkNotNullParameter(mapping, "mapping");
        Object obj4 = mapping.get(obj2);
        return obj4 == null ? obj3 : obj4;
    }

    public static Object u(Object obj2, Map mapping) throws Throwable {
        bsi.b exceptionProvider = new bsi.b(obj2, mapping, 1);
        Intrinsics.checkNotNullParameter(mapping, "mapping");
        Intrinsics.checkNotNullParameter(exceptionProvider, "exceptionProvider");
        Object obj3 = mapping.get(obj2);
        if (obj3 != null) {
            return obj3;
        }
        throw ((Throwable) exceptionProvider.invoke(obj2));
    }

    public static final Object v(Object obj2, Map mapping) {
        Intrinsics.checkNotNullParameter(mapping, "mapping");
        try {
            return u(obj2, mapping);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final j90.a w(Activity activity, int i) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        return new j90.a(i);
    }

    public static final j90.c x(Fragment fragment, int i) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        return new j90.c(i);
    }
}
