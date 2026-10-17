package com.onfido.android.sdk.capture.utils;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import nkm.y;
import org.jetbrains.annotations.NotNull;
import zhm.d0;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0007\bB\u0007\b\u0004¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lcom/onfido/android/sdk/capture/utils/StringRepresentation;", "", "()V", "getString", "", "context", "Landroid/content/Context;", "MultiStringResIdsRepresentation", "SingleStringResIdRepresentation", "Lcom/onfido/android/sdk/capture/utils/StringRepresentation$MultiStringResIdsRepresentation;", "Lcom/onfido/android/sdk/capture/utils/StringRepresentation$SingleStringResIdRepresentation;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class StringRepresentation {

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÂ\u0003J\t\u0010\t\u001a\u00020\u0006HÂ\u0003J#\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\t\u0010\u0012\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0006HÖ\u0001R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/onfido/android/sdk/capture/utils/StringRepresentation$MultiStringResIdsRepresentation;", "Lcom/onfido/android/sdk/capture/utils/StringRepresentation;", "resIds", "", "", "separator", "", "(Ljava/util/List;Ljava/lang/String;)V", "component1", "component2", "copy", "equals", "", "other", "", "getString", "context", "Landroid/content/Context;", "hashCode", "toString", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class MultiStringResIdsRepresentation extends StringRepresentation {

        @NotNull
        private final List<Integer> resIds;

        @NotNull
        private final String separator;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MultiStringResIdsRepresentation(@NotNull List<Integer> resIds, @NotNull String separator) {
            super(null);
            Intrinsics.checkNotNullParameter(resIds, "resIds");
            Intrinsics.checkNotNullParameter(separator, "separator");
            this.resIds = resIds;
            this.separator = separator;
        }

        private final List<Integer> component1() {
            return this.resIds;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        private final String getSeparator() {
            return this.separator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MultiStringResIdsRepresentation copy$default(MultiStringResIdsRepresentation multiStringResIdsRepresentation, List list, String str, int i, Object obj2) {
            if ((i & 1) != 0) {
                list = multiStringResIdsRepresentation.resIds;
            }
            if ((i & 2) != 0) {
                str = multiStringResIdsRepresentation.separator;
            }
            return multiStringResIdsRepresentation.copy(list, str);
        }

        @NotNull
        public final MultiStringResIdsRepresentation copy(@NotNull List<Integer> resIds, @NotNull String separator) {
            Intrinsics.checkNotNullParameter(resIds, "resIds");
            Intrinsics.checkNotNullParameter(separator, "separator");
            return new MultiStringResIdsRepresentation(resIds, separator);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MultiStringResIdsRepresentation)) {
                return false;
            }
            MultiStringResIdsRepresentation multiStringResIdsRepresentation = (MultiStringResIdsRepresentation) other;
            return Intrinsics.f(this.resIds, multiStringResIdsRepresentation.resIds) && Intrinsics.f(this.separator, multiStringResIdsRepresentation.separator);
        }

        @Override // com.onfido.android.sdk.capture.utils.StringRepresentation
        @NotNull
        public String getString(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return y.u(y.x(d0.Q(this.resIds), new StringRepresentation$MultiStringResIdsRepresentation$getString$1(context)), this.separator, null, 62);
        }

        public int hashCode() {
            return this.separator.hashCode() + (this.resIds.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb6 = new StringBuilder("MultiStringResIdsRepresentation(resIds=");
            sb6.append(this.resIds);
            sb6.append(", separator=");
            return j6.a.u(sb6, this.separator, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }

        public /* synthetic */ MultiStringResIdsRepresentation(List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i & 2) != 0 ? " " : str);
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0005\u001a\u00020\u0003HÂ\u0003J\u0013\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nHÖ\u0003J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\fHÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/onfido/android/sdk/capture/utils/StringRepresentation$SingleStringResIdRepresentation;", "Lcom/onfido/android/sdk/capture/utils/StringRepresentation;", "resId", "", "(I)V", "component1", "copy", "equals", "", "other", "", "getString", "", "context", "Landroid/content/Context;", "hashCode", "toString", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SingleStringResIdRepresentation extends StringRepresentation {
        private final int resId;

        public SingleStringResIdRepresentation(int i) {
            super(null);
            this.resId = i;
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        private final int getResId() {
            return this.resId;
        }

        public static /* synthetic */ SingleStringResIdRepresentation copy$default(SingleStringResIdRepresentation singleStringResIdRepresentation, int i, int i2, Object obj2) {
            if ((i2 & 1) != 0) {
                i = singleStringResIdRepresentation.resId;
            }
            return singleStringResIdRepresentation.copy(i);
        }

        @NotNull
        public final SingleStringResIdRepresentation copy(int resId) {
            return new SingleStringResIdRepresentation(resId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SingleStringResIdRepresentation) && this.resId == ((SingleStringResIdRepresentation) other).resId;
        }

        @Override // com.onfido.android.sdk.capture.utils.StringRepresentation
        @NotNull
        public String getString(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            String string = context.getString(this.resId);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }

        public int hashCode() {
            return Integer.hashCode(this.resId);
        }

        @NotNull
        public String toString() {
            return j6.a.t(new StringBuilder("SingleStringResIdRepresentation(resId="), this.resId, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    private StringRepresentation() {
    }

    @NotNull
    public abstract String getString(@NotNull Context context);

    public /* synthetic */ StringRepresentation(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
