package com.fourthline.vision.internal;

import com.fourthline.core.VideoDuration;
import com.fourthline.vision.internal.w;
import com.fourthline.vision.selfie.LivenessCheckType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class ab extends k8 {
    private static final a d = new a(null);
    public static final int e = 8;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final LivenessCheckType f35958c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LivenessCheckType.values().length];
            try {
                iArr[LivenessCheckType.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LivenessCheckType.HEAD_TURN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab(@NotNull LivenessCheckType livenessCheckType, @NotNull d2 metadataSource) {
        super(metadataSource, new aem.v(12));
        Intrinsics.checkNotNullParameter(livenessCheckType, "livenessCheckType");
        Intrinsics.checkNotNullParameter(metadataSource, "metadataSource");
        this.f35958c = livenessCheckType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long _init_$lambda$0() {
        return VideoDuration.DEFAULT.INSTANCE.getDuration();
    }

    private final long getFirstLivenessImageTakenTimestamp(List<? extends z8> list) throws w.e {
        Long l2;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof v8) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj3 = arrayList.get(i);
            i++;
            if (((v8) obj3).getTimestamp() > getFirstImageTakenTimestamp(list)) {
                arrayList2.add(obj3);
            }
        }
        Iterator it8 = arrayList2.iterator();
        if (it8.hasNext()) {
            Long lValueOf = Long.valueOf(((v8) it8.next()).getTimestamp());
            while (it8.hasNext()) {
                Long lValueOf2 = Long.valueOf(((v8) it8.next()).getTimestamp());
                if (lValueOf.compareTo(lValueOf2) > 0) {
                    lValueOf = lValueOf2;
                }
            }
            l2 = lValueOf;
        } else {
            l2 = null;
        }
        if (l2 != null) {
            return l2.longValue();
        }
        throw w.e.f37040a;
    }

    @Override // com.fourthline.vision.internal.k8
    public long getTrimmedVideoStartMs(@NotNull List<? extends z8> list) throws w.e {
        long firstImageTakenTimestamp;
        Intrinsics.checkNotNullParameter(list, "<this>");
        int i = b.$EnumSwitchMapping$0[this.f35958c.ordinal()];
        if (i == 1) {
            firstImageTakenTimestamp = getFirstImageTakenTimestamp(list);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            firstImageTakenTimestamp = getFirstLivenessImageTakenTimestamp(list);
        }
        return (firstImageTakenTimestamp - getRecordingStartTimestamp()) - 1000;
    }
}
