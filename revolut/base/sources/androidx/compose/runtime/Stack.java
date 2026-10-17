package androidx.compose.runtime;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0007\b\u0081@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B!\u0012\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0003j\b\u0012\u0004\u0012\u00028\u0000`\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\u000f\u001a\u00028\u0000¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0011\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u000eJ\u0015\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0010\u0010\u0014J\r\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0019\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u0016J\r\u0010\u001d\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e¢\u0006\u0004\b\u001f\u0010 R\u0011\u0010$\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\"\u0010#\u0088\u0001\u0005\u0092\u0001\u0012\u0012\u0004\u0012\u00028\u00000\u0003j\b\u0012\u0004\u0012\u00028\u0000`\u0004¨\u0006%"}, d2 = {"Landroidx/compose/runtime/Stack;", "T", "", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "backing", "constructor-impl", "(Ljava/util/ArrayList;)Ljava/util/ArrayList;", "value", "", "push-impl", "(Ljava/util/ArrayList;Ljava/lang/Object;)Z", "push", "pop-impl", "(Ljava/util/ArrayList;)Ljava/lang/Object;", "pop", "peek-impl", "peek", "", "index", "(Ljava/util/ArrayList;I)Ljava/lang/Object;", "isEmpty-impl", "(Ljava/util/ArrayList;)Z", "isEmpty", "isNotEmpty-impl", "isNotEmpty", "", "clear-impl", "(Ljava/util/ArrayList;)V", "clear", "", "toArray-impl", "(Ljava/util/ArrayList;)[Ljava/lang/Object;", "toArray", "getSize-impl", "(Ljava/util/ArrayList;)I", "size", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class Stack<T> {
    /* JADX INFO: renamed from: clear-impl, reason: not valid java name */
    public static final void m1651clearimpl(ArrayList<T> arrayList) {
        arrayList.clear();
    }

    @NotNull
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static <T> ArrayList<T> m1652constructorimpl(@NotNull ArrayList<T> arrayList) {
        return arrayList;
    }

    /* JADX INFO: renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ ArrayList m1653constructorimpl$default(ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            arrayList = new ArrayList();
        }
        return m1652constructorimpl(arrayList);
    }

    /* JADX INFO: renamed from: getSize-impl, reason: not valid java name */
    public static final int m1654getSizeimpl(ArrayList<T> arrayList) {
        return arrayList.size();
    }

    /* JADX INFO: renamed from: isEmpty-impl, reason: not valid java name */
    public static final boolean m1655isEmptyimpl(ArrayList<T> arrayList) {
        return arrayList.isEmpty();
    }

    /* JADX INFO: renamed from: isNotEmpty-impl, reason: not valid java name */
    public static final boolean m1656isNotEmptyimpl(ArrayList<T> arrayList) {
        return !m1655isEmptyimpl(arrayList);
    }

    /* JADX INFO: renamed from: peek-impl, reason: not valid java name */
    public static final T m1657peekimpl(ArrayList<T> arrayList) {
        return arrayList.get(m1654getSizeimpl(arrayList) - 1);
    }

    /* JADX INFO: renamed from: pop-impl, reason: not valid java name */
    public static final T m1659popimpl(ArrayList<T> arrayList) {
        return arrayList.remove(m1654getSizeimpl(arrayList) - 1);
    }

    /* JADX INFO: renamed from: push-impl, reason: not valid java name */
    public static final boolean m1660pushimpl(ArrayList<T> arrayList, T t2) {
        return arrayList.add(t2);
    }

    @NotNull
    /* JADX INFO: renamed from: toArray-impl, reason: not valid java name */
    public static final T[] m1661toArrayimpl(ArrayList<T> arrayList) {
        int size = arrayList.size();
        T[] tArr = (T[]) new Object[size];
        for (int i = 0; i < size; i++) {
            tArr[i] = arrayList.get(i);
        }
        return tArr;
    }

    /* JADX INFO: renamed from: peek-impl, reason: not valid java name */
    public static final T m1658peekimpl(ArrayList<T> arrayList, int i) {
        return arrayList.get(i);
    }
}
