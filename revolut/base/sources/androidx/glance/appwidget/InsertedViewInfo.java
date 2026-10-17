package androidx.glance.appwidget;

import ch.qos.logback.core.CoreConstants;
import j6.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.r0;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012 \b\u0002\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\u00050\u0005¢\u0006\u0004\b\b\u0010\tJF\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022 \b\u0002\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\u00050\u0005HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\u0010R/\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\u00050\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Landroidx/glance/appwidget/InsertedViewInfo;", "", "", "mainViewId", "complexViewId", "", "Landroidx/glance/appwidget/SizeSelector;", "children", "<init>", "(IILjava/util/Map;)V", "copy", "(IILjava/util/Map;)Landroidx/glance/appwidget/InsertedViewInfo;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getMainViewId", "getComplexViewId", "Ljava/util/Map;", "getChildren", "()Ljava/util/Map;", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class InsertedViewInfo {

    @NotNull
    private final Map<Integer, Map<SizeSelector, Integer>> children;
    private final int complexViewId;
    private final int mainViewId;

    /* JADX WARN: Multi-variable type inference failed */
    public InsertedViewInfo(int i, int i2, @NotNull Map<Integer, ? extends Map<SizeSelector, Integer>> map) {
        this.mainViewId = i;
        this.complexViewId = i2;
        this.children = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InsertedViewInfo copy$default(InsertedViewInfo insertedViewInfo, int i, int i2, Map map, int i3, Object obj2) {
        if ((i3 & 1) != 0) {
            i = insertedViewInfo.mainViewId;
        }
        if ((i3 & 2) != 0) {
            i2 = insertedViewInfo.complexViewId;
        }
        if ((i3 & 4) != 0) {
            map = insertedViewInfo.children;
        }
        return insertedViewInfo.copy(i, i2, map);
    }

    @NotNull
    public final InsertedViewInfo copy(int mainViewId, int complexViewId, @NotNull Map<Integer, ? extends Map<SizeSelector, Integer>> children) {
        return new InsertedViewInfo(mainViewId, complexViewId, children);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InsertedViewInfo)) {
            return false;
        }
        InsertedViewInfo insertedViewInfo = (InsertedViewInfo) other;
        return this.mainViewId == insertedViewInfo.mainViewId && this.complexViewId == insertedViewInfo.complexViewId && Intrinsics.f(this.children, insertedViewInfo.children);
    }

    @NotNull
    public final Map<Integer, Map<SizeSelector, Integer>> getChildren() {
        return this.children;
    }

    public final int getComplexViewId() {
        return this.complexViewId;
    }

    public final int getMainViewId() {
        return this.mainViewId;
    }

    public int hashCode() {
        return this.children.hashCode() + a.b(this.complexViewId, Integer.hashCode(this.mainViewId) * 31, 31);
    }

    @NotNull
    public String toString() {
        return "InsertedViewInfo(mainViewId=" + this.mainViewId + ", complexViewId=" + this.complexViewId + ", children=" + this.children + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ InsertedViewInfo(int i, int i2, Map map, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? -1 : i, (i3 & 2) != 0 ? -1 : i2, (i3 & 4) != 0 ? r0.g() : map);
    }
}
