package com.fourthline.vision.internal;

import com.fourthline.core.internal.TimestampProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class p5 extends zd {
    private final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final d2 f36680g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f36681h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5(int i, @NotNull d2 metadataSource, @NotNull TimestampProvider timestampProvider, long j2, @NotNull TimeUnit timeUnit) {
        super(timestampProvider, j2, timeUnit);
        Intrinsics.checkNotNullParameter(metadataSource, "metadataSource");
        Intrinsics.checkNotNullParameter(timestampProvider, "timestampProvider");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        this.f = i;
        this.f36680g = metadataSource;
        this.f36681h = true;
    }

    private final Long getTimestampOfFirstImageTaken() {
        Object obj2;
        Iterable iterable = (Iterable) this.f36680g.get();
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : iterable) {
            if (obj3 instanceof v8) {
                arrayList.add(obj3);
            }
        }
        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj4 = arrayList.get(i);
            i++;
            arrayList2.add(Long.valueOf(((v8) obj4).getTimestamp()));
        }
        Iterator it8 = arrayList2.iterator();
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
        return (Long) obj2;
    }

    @Override // com.fourthline.vision.internal.m, com.fourthline.vision.internal.qd, com.fourthline.vision.internal.x1
    public /* bridge */ /* synthetic */ Object consume(Object obj2, Continuation continuation) {
        return consume((Unit) obj2, (Continuation<? super Unit>) continuation);
    }

    @Override // com.fourthline.vision.internal.m, com.fourthline.vision.internal.qd, com.fourthline.vision.internal.pd
    public void stop() {
        this.f36681h = false;
        super.stop();
    }

    @Override // com.fourthline.vision.internal.m
    public Object consume(@NotNull Unit unit, @NotNull Continuation<? super Unit> continuation) {
        Long timestampOfFirstImageTaken;
        if (this.f > 1 && this.f36681h && (timestampOfFirstImageTaken = getTimestampOfFirstImageTaken()) != null) {
            setStartTimestamp(timestampOfFirstImageTaken.longValue());
        }
        Object objConsume = super.consume(unit, continuation);
        return objConsume == fim.a.COROUTINE_SUSPENDED ? objConsume : Unit.f186387a;
    }

    public /* synthetic */ p5(int i, d2 d2Var, TimestampProvider timestampProvider, long j2, TimeUnit timeUnit, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, d2Var, timestampProvider, j2, (i2 & 16) != 0 ? TimeUnit.MILLISECONDS : timeUnit);
    }
}
