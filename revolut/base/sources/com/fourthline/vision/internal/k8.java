package com.fourthline.vision.internal;

import com.fourthline.vision.internal.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public abstract class k8 implements d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d2 f36450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function0 f36451b;

    public k8(@NotNull d2 metadataSource, @NotNull Function0<Long> maxDuration) {
        Intrinsics.checkNotNullParameter(metadataSource, "metadataSource");
        Intrinsics.checkNotNullParameter(maxDuration, "maxDuration");
        this.f36450a = metadataSource;
        this.f36451b = maxDuration;
    }

    private final List<z8> getMetadataEvents() {
        return (List) this.f36450a.get();
    }

    private final long getRecordingEndTimestamp() throws w.e {
        z8 z8VarPrevious;
        List<z8> metadataEvents = getMetadataEvents();
        ListIterator<z8> listIterator = metadataEvents.listIterator(metadataEvents.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                z8VarPrevious = null;
                break;
            }
            z8VarPrevious = listIterator.previous();
            if (z8VarPrevious instanceof y8) {
                break;
            }
        }
        z8 z8Var = z8VarPrevious;
        if (z8Var != null) {
            return z8Var.getTimestamp();
        }
        throw w.e.f37040a;
    }

    public final long getFirstImageTakenTimestamp(@NotNull List<? extends z8> list) {
        Object obj2;
        Intrinsics.checkNotNullParameter(list, "<this>");
        int i = 0;
        if (getClass().isAnonymousClass()) {
            String name = getClass().getName();
            if (name.length() > 23) {
                Intrinsics.checkNotNullExpressionValue(name.substring(name.length() - 23, name.length()), "substring(...)");
            }
        } else {
            String simpleName = getClass().getSimpleName();
            if (simpleName.length() > 23) {
                Intrinsics.checkNotNullExpressionValue(simpleName.substring(0, 23), "substring(...)");
            }
        }
        Objects.toString(list);
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : list) {
            if (obj3 instanceof v8) {
                arrayList.add(obj3);
            }
        }
        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj4 = arrayList.get(i2);
            i2++;
            arrayList2.add(Long.valueOf(((v8) obj4).getTimestamp()));
        }
        ArrayList arrayList3 = new ArrayList();
        int size2 = arrayList2.size();
        while (i < size2) {
            Object obj5 = arrayList2.get(i);
            i++;
            if (((Number) obj5).longValue() > getRecordingStartTimestamp()) {
                arrayList3.add(obj5);
            }
        }
        Iterator it8 = arrayList3.iterator();
        if (it8.hasNext()) {
            Object next = it8.next();
            if (it8.hasNext()) {
                long jLongValue = ((Number) next).longValue();
                do {
                    Object next2 = it8.next();
                    long jLongValue2 = ((Number) next2).longValue();
                    if (jLongValue > jLongValue2) {
                        next = next2;
                        jLongValue = jLongValue2;
                    }
                } while (it8.hasNext());
            }
            obj2 = next;
        } else {
            obj2 = null;
        }
        Long l2 = (Long) obj2;
        if (l2 != null) {
            return l2.longValue();
        }
        throw w.e.f37040a;
    }

    public final long getRecordingStartTimestamp() {
        z8 z8VarPrevious;
        List<z8> metadataEvents = getMetadataEvents();
        ListIterator<z8> listIterator = metadataEvents.listIterator(metadataEvents.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                z8VarPrevious = null;
                break;
            }
            z8VarPrevious = listIterator.previous();
            if (z8VarPrevious instanceof x8) {
                break;
            }
        }
        z8 z8Var = z8VarPrevious;
        if (z8Var != null) {
            return z8Var.getTimestamp();
        }
        throw w.e.f37040a;
    }

    public abstract long getTrimmedVideoStartMs(@NotNull List<? extends z8> list);

    @Override // com.fourthline.vision.internal.d2
    public /* bridge */ void subscribe(Function2<? super Pair<Long, Long>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        super.subscribe(function2);
    }

    @Override // com.fourthline.vision.internal.d2
    @NotNull
    public Pair<Long, Long> get() {
        long recordingEndTimestamp = getRecordingEndTimestamp() - getRecordingStartTimestamp();
        long trimmedVideoStartMs = getTrimmedVideoStartMs(getMetadataEvents());
        if (trimmedVideoStartMs < 0) {
            trimmedVideoStartMs = 0;
        }
        long jLongValue = ((Number) this.f36451b.invoke()).longValue() + trimmedVideoStartMs;
        if (recordingEndTimestamp >= jLongValue) {
            recordingEndTimestamp = jLongValue;
        }
        Long lValueOf = Long.valueOf(trimmedVideoStartMs);
        Long lValueOf2 = Long.valueOf(recordingEndTimestamp);
        if (getClass().isAnonymousClass()) {
            String name = getClass().getName();
            if (name.length() > 23) {
                Intrinsics.checkNotNullExpressionValue(name.substring(name.length() - 23, name.length()), "substring(...)");
            }
        } else {
            String simpleName = getClass().getSimpleName();
            if (simpleName.length() > 23) {
                Intrinsics.checkNotNullExpressionValue(simpleName.substring(0, 23), "substring(...)");
            }
        }
        return new Pair<>(lValueOf, lValueOf2);
    }
}
