package androidx.compose.runtime.tooling;

import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.RememberObserverHolder;
import androidx.compose.runtime.SlotReader;
import androidx.compose.runtime.SlotTable;
import androidx.compose.runtime.SlotWriter;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a;\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0019\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006*\u00020\nH\u0000¢\u0006\u0004\b\b\u0010\u000b\u001a+\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006*\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\f\u0010\r\u001a+\u0010\u0013\u001a\u0004\u0018\u00010\u0012*\u00020\u000e2\u0014\u0010\u0011\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00100\u000fH\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001d\u0010\u0017\u001a\u0004\u0018\u00010\u0003*\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroidx/compose/runtime/SlotWriter;", "", "child", "", "group", "parent", "", "Landroidx/compose/runtime/tooling/ComposeStackTraceFrame;", "buildTrace", "(Landroidx/compose/runtime/SlotWriter;Ljava/lang/Object;ILjava/lang/Integer;)Ljava/util/List;", "Landroidx/compose/runtime/SlotReader;", "(Landroidx/compose/runtime/SlotReader;)Ljava/util/List;", "traceForGroup", "(Landroidx/compose/runtime/SlotReader;ILjava/lang/Object;)Ljava/util/List;", "Landroidx/compose/runtime/SlotTable;", "Lkotlin/Function1;", "", "filter", "Landroidx/compose/runtime/tooling/ObjectLocation;", "findLocation", "(Landroidx/compose/runtime/SlotTable;Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/tooling/ObjectLocation;", "Landroidx/compose/runtime/CompositionContext;", "context", "findSubcompositionContextGroup", "(Landroidx/compose/runtime/SlotTable;Landroidx/compose/runtime/CompositionContext;)Ljava/lang/Integer;", "runtime"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class ComposeStackTraceBuilderKt {
    @NotNull
    public static final List<ComposeStackTraceFrame> buildTrace(@NotNull SlotWriter slotWriter, Object obj2, int i, Integer num) {
        int iGroupKey;
        if (slotWriter.getClosed() || slotWriter.getSize$runtime() == 0) {
            return f0.f322471a;
        }
        WriterTraceBuilder writerTraceBuilder = new WriterTraceBuilder(slotWriter);
        int iIntValue = num != null ? num.intValue() : slotWriter.getParent() < 0 ? slotWriter.parent(i) : slotWriter.getParent();
        if (obj2 == null) {
            obj2 = Integer.valueOf(slotWriter.groupSlotIndex(i));
        }
        if (slotWriter.isValid(i)) {
            iGroupKey = slotWriter.groupKey(i);
        } else {
            int iParent = iIntValue >= 0 ? slotWriter.parent(iIntValue) : iIntValue;
            iGroupKey = slotWriter.groupKey(iIntValue);
            int i2 = iIntValue;
            iIntValue = iParent;
            i = i2;
        }
        while (i >= 0) {
            writerTraceBuilder.processEdge(iGroupKey, slotWriter.hasObjectKey(i) ? slotWriter.groupObjectKey(i) : Composer.INSTANCE.getEmpty(), slotWriter.sourceInformationOf$runtime(i), obj2);
            obj2 = slotWriter.anchor(i);
            if (iIntValue >= 0) {
                int iParent2 = slotWriter.parent(iIntValue);
                iGroupKey = slotWriter.groupKey(iIntValue);
                int i3 = iIntValue;
                iIntValue = iParent2;
                i = i3;
            } else {
                i = iIntValue;
            }
        }
        return writerTraceBuilder.trace();
    }

    public static /* synthetic */ List buildTrace$default(SlotWriter slotWriter, Object obj2, int i, Integer num, int i2, Object obj3) {
        if ((i2 & 1) != 0) {
            obj2 = null;
        }
        if ((i2 & 2) != 0) {
            i = slotWriter.getCurrentGroup();
        }
        if ((i2 & 4) != 0) {
            num = null;
        }
        return buildTrace(slotWriter, obj2, i, num);
    }

    public static final ObjectLocation findLocation(@NotNull SlotTable slotTable, @NotNull Function1<Object, Boolean> function1) {
        SlotReader slotReaderOpenReader = slotTable.openReader();
        for (int i = 0; i < slotTable.getGroupsSize(); i++) {
            try {
                if (slotReaderOpenReader.isNode(i) && ((Boolean) function1.invoke(slotReaderOpenReader.node(i))).booleanValue()) {
                    return new ObjectLocation(i, null);
                }
                int iSlotSize = slotReaderOpenReader.slotSize(i);
                for (int i2 = 0; i2 < iSlotSize; i2++) {
                    if (((Boolean) function1.invoke(slotReaderOpenReader.groupGet(i, i2))).booleanValue()) {
                        return new ObjectLocation(i, Integer.valueOf(i2));
                    }
                }
            } finally {
                slotReaderOpenReader.close();
            }
        }
        Unit unit = Unit.f186387a;
        return null;
    }

    public static final Integer findSubcompositionContextGroup(@NotNull SlotTable slotTable, @NotNull CompositionContext compositionContext) {
        SlotReader slotReaderOpenReader = slotTable.openReader();
        try {
            return findSubcompositionContextGroup$lambda$0$scanGroup(slotReaderOpenReader, compositionContext, 0, slotReaderOpenReader.getGroupsSize());
        } finally {
            slotReaderOpenReader.close();
        }
    }

    private static final Integer findSubcompositionContextGroup$lambda$0$scanGroup(SlotReader slotReader, CompositionContext compositionContext, int i, int i2) {
        Integer numFindSubcompositionContextGroup$lambda$0$scanGroup;
        while (true) {
            if (i >= i2) {
                return null;
            }
            int iGroupSize = slotReader.groupSize(i) + i;
            if (slotReader.hasMark(i) && slotReader.groupKey(i) == 206 && Intrinsics.f(slotReader.groupObjectKey(i), ComposerKt.getReference())) {
                Object objGroupGet = slotReader.groupGet(i, 0);
                RememberObserverHolder rememberObserverHolder = objGroupGet instanceof RememberObserverHolder ? (RememberObserverHolder) objGroupGet : null;
                RememberObserver wrapped = rememberObserverHolder != null ? rememberObserverHolder.getWrapped() : null;
                ComposerImpl.CompositionContextHolder compositionContextHolder = wrapped instanceof ComposerImpl.CompositionContextHolder ? (ComposerImpl.CompositionContextHolder) wrapped : null;
                if (compositionContextHolder != null && Intrinsics.f(compositionContextHolder.getRef(), compositionContext)) {
                    return Integer.valueOf(i);
                }
            }
            if (slotReader.containsMark(i) && (numFindSubcompositionContextGroup$lambda$0$scanGroup = findSubcompositionContextGroup$lambda$0$scanGroup(slotReader, compositionContext, i + 1, iGroupSize)) != null) {
                return Integer.valueOf(numFindSubcompositionContextGroup$lambda$0$scanGroup.intValue());
            }
            i = iGroupSize;
        }
    }

    @NotNull
    public static final List<ComposeStackTraceFrame> traceForGroup(@NotNull SlotReader slotReader, int i, Object obj2) {
        ReaderTraceBuilder readerTraceBuilder = new ReaderTraceBuilder(slotReader);
        int iParent = slotReader.parent(i);
        Anchor anchor = slotReader.anchor(i);
        while (i >= 0) {
            readerTraceBuilder.processEdge(slotReader.groupKey(i), slotReader.hasObjectKey(i) ? slotReader.groupObjectKey(i) : Composer.INSTANCE.getEmpty(), slotReader.getTable().sourceInformationOf(i), obj2);
            if (iParent >= 0) {
                Anchor anchor2 = anchor;
                anchor = slotReader.anchor(iParent);
                i = iParent;
                iParent = slotReader.parent(iParent);
                obj2 = anchor2;
            } else {
                i = iParent;
                obj2 = anchor;
            }
        }
        return readerTraceBuilder.trace();
    }

    @NotNull
    public static final List<ComposeStackTraceFrame> buildTrace(@NotNull SlotReader slotReader) {
        Object empty;
        if (!slotReader.getClosed() && slotReader.getGroupsSize() != 0) {
            ReaderTraceBuilder readerTraceBuilder = new ReaderTraceBuilder(slotReader);
            int parent = slotReader.getParent();
            Object objValueOf = Integer.valueOf(slotReader.getSlot());
            while (parent >= 0) {
                if (slotReader.hasObjectKey(parent)) {
                    empty = slotReader.groupObjectKey(parent);
                } else {
                    empty = Composer.INSTANCE.getEmpty();
                }
                readerTraceBuilder.processEdge(slotReader.groupKey(parent), empty, slotReader.getTable().sourceInformationOf(parent), objValueOf);
                objValueOf = slotReader.anchor(parent);
                parent = slotReader.parent(parent);
            }
            return readerTraceBuilder.trace();
        }
        return f0.f322471a;
    }
}
