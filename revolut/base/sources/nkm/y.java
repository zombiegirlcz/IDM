package nkm;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import zhm.f0;
import zhm.h0;
import zhm.y0;

/* JADX INFO: loaded from: classes13.dex */
public class y extends u {
    public static Float A(h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        g gVar = new g(hVar);
        if (!gVar.hasNext()) {
            return null;
        }
        float fFloatValue = ((Number) gVar.next()).floatValue();
        while (gVar.hasNext()) {
            fFloatValue = Math.max(fFloatValue, ((Number) gVar.next()).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    public static Comparable B(h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        g gVar = new g(hVar);
        if (!gVar.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) gVar.next();
        while (gVar.hasNext()) {
            Comparable comparable2 = (Comparable) gVar.next();
            if (comparable.compareTo(comparable2) > 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static Float C(h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        g gVar = new g(hVar);
        if (!gVar.hasNext()) {
            return null;
        }
        float fFloatValue = ((Number) gVar.next()).floatValue();
        while (gVar.hasNext()) {
            fFloatValue = Math.min(fFloatValue, ((Number) gVar.next()).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    public static j D(Sequence sequence, Object obj2) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Sequence[] elements = {sequence, new r(obj2, 1)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return t.e(kotlin.collections.d.E(elements));
    }

    public static j E(Sequence sequence, Sequence elements) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        Sequence[] elements2 = {sequence, elements};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        return t.e(kotlin.collections.d.E(elements2));
    }

    public static c F(Sequence sequence, Comparator comparator) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return new c(sequence, comparator);
    }

    public static float G(h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        g gVar = new g(hVar);
        float fFloatValue = BitmapDescriptorFactory.HUE_RED;
        while (gVar.hasNext()) {
            fFloatValue += ((Number) gVar.next()).floatValue();
        }
        return fFloatValue;
    }

    public static Sequence H(Sequence sequence, int i) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        if (i >= 0) {
            return i == 0 ? f.f216837a : sequence instanceof e ? ((e) sequence).b(i) : new b0(sequence, i, 0);
        }
        throw new IllegalArgumentException(j6.a.l(i, "Requested element count ", " is less than zero.").toString());
    }

    public static l I(Sequence sequence, Function1 predicate) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return new l(sequence, predicate);
    }

    public static List J(Sequence sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator it8 = sequence.iterator();
        if (!it8.hasNext()) {
            return f0.f322471a;
        }
        Object next = it8.next();
        if (!it8.hasNext()) {
            return zhm.u.c(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it8.hasNext()) {
            arrayList.add(it8.next());
        }
        return arrayList;
    }

    public static ArrayList K(Sequence sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        ArrayList destination = new ArrayList();
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Iterator it8 = sequence.iterator();
        while (it8.hasNext()) {
            destination.add(it8.next());
        }
        return destination;
    }

    public static Set L(Sequence sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator it8 = sequence.iterator();
        if (!it8.hasNext()) {
            return h0.f322473a;
        }
        Object next = it8.next();
        if (!it8.hasNext()) {
            return y0.b(next);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(next);
        while (it8.hasNext()) {
            linkedHashSet.add(it8.next());
        }
        return linkedHashSet;
    }

    public static int j(Sequence sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator it8 = sequence.iterator();
        int i = 0;
        while (it8.hasNext()) {
            it8.next();
            i++;
            if (i < 0) {
                zhm.v.r();
                throw null;
            }
        }
        return i;
    }

    public static c k(Sequence sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return l(sequence, new njf.d(19));
    }

    public static c l(Sequence sequence, Function1 selector) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return new c(sequence, selector);
    }

    public static Sequence m(Sequence sequence, int i) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        if (i >= 0) {
            return i == 0 ? sequence : sequence instanceof e ? ((e) sequence).a(i) : new b0(sequence, i, 1);
        }
        throw new IllegalArgumentException(j6.a.l(i, "Requested element count ", " is less than zero.").toString());
    }

    public static h n(Sequence sequence, Function1 predicate) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return new h(sequence, true, predicate);
    }

    public static h o(Sequence sequence, Function1 predicate) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return new h(sequence, false, predicate);
    }

    public static h p(Sequence sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return o(sequence, new jli.f(17));
    }

    public static Object q(Sequence sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator it8 = sequence.iterator();
        if (it8.hasNext()) {
            return it8.next();
        }
        throw new NoSuchElementException("Sequence is empty.");
    }

    public static Object r(Sequence sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator it8 = sequence.iterator();
        if (it8.hasNext()) {
            return it8.next();
        }
        return null;
    }

    public static j s(Sequence sequence, Function1 transform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return new j(sequence, transform, w.f);
    }

    public static j t(Sequence sequence, Function1 transform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return new j(sequence, transform, v.f);
    }

    public static String u(Sequence sequence, CharSequence separator, Function1 function1, int i) {
        if ((i & 32) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter("", "prefix");
        Intrinsics.checkNotNullParameter("", "postfix");
        Intrinsics.checkNotNullParameter("...", "truncated");
        StringBuilder buffer = new StringBuilder();
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter("", "prefix");
        Intrinsics.checkNotNullParameter("", "postfix");
        Intrinsics.checkNotNullParameter("...", "truncated");
        buffer.append((CharSequence) "");
        int i2 = 0;
        for (Object obj2 : sequence) {
            i2++;
            if (i2 > 1) {
                buffer.append(separator);
            }
            kotlin.text.s.a(buffer, obj2, function1);
        }
        buffer.append((CharSequence) "");
        return buffer.toString();
    }

    public static Object v(Sequence sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator it8 = sequence.iterator();
        if (!it8.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        Object next = it8.next();
        while (it8.hasNext()) {
            next = it8.next();
        }
        return next;
    }

    public static Object w(Sequence sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator it8 = sequence.iterator();
        if (!it8.hasNext()) {
            return null;
        }
        Object next = it8.next();
        while (it8.hasNext()) {
            next = it8.next();
        }
        return next;
    }

    public static d0 x(Sequence sequence, Function1 transform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return new d0(sequence, transform);
    }

    public static c y(Sequence sequence, Function2 transform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return new c(sequence, transform);
    }

    public static h z(Sequence sequence, Function1 transform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return p(new d0(sequence, transform));
    }
}
