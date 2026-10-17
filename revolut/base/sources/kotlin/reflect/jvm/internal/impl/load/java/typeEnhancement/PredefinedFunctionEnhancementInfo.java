package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes14.dex */
public final class PredefinedFunctionEnhancementInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TypeEnhancementInfo f187035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f187036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f187037c;
    public final PredefinedFunctionEnhancementInfo d;

    public PredefinedFunctionEnhancementInfo() {
        this(null, null, null, 7, null);
    }

    public final String getErrorsSinceLanguageVersion() {
        return this.f187037c;
    }

    @NotNull
    public final List<TypeEnhancementInfo> getParametersInfo() {
        return this.f187036b;
    }

    public final TypeEnhancementInfo getReturnTypeInfo() {
        return this.f187035a;
    }

    public final PredefinedFunctionEnhancementInfo getWarningModeClone() {
        return this.d;
    }

    public PredefinedFunctionEnhancementInfo(TypeEnhancementInfo typeEnhancementInfo, @NotNull List<TypeEnhancementInfo> parametersInfo, String str) {
        Intrinsics.checkNotNullParameter(parametersInfo, "parametersInfo");
        this.f187035a = typeEnhancementInfo;
        this.f187036b = parametersInfo;
        this.f187037c = str;
        PredefinedFunctionEnhancementInfo predefinedFunctionEnhancementInfo = null;
        if (str != null) {
            TypeEnhancementInfo typeEnhancementInfoCopyForWarnings = typeEnhancementInfo != null ? typeEnhancementInfo.copyForWarnings() : null;
            List<TypeEnhancementInfo> list = parametersInfo;
            ArrayList arrayList = new ArrayList(w.t(list, 10));
            for (TypeEnhancementInfo typeEnhancementInfo2 : list) {
                arrayList.add(typeEnhancementInfo2 != null ? typeEnhancementInfo2.copyForWarnings() : null);
            }
            predefinedFunctionEnhancementInfo = new PredefinedFunctionEnhancementInfo(typeEnhancementInfoCopyForWarnings, arrayList, null);
        }
        this.d = predefinedFunctionEnhancementInfo;
    }

    public PredefinedFunctionEnhancementInfo(TypeEnhancementInfo typeEnhancementInfo, List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : typeEnhancementInfo, (i & 2) != 0 ? f0.f322471a : list, (i & 4) != 0 ? null : str);
    }
}
