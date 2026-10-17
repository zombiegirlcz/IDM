package com.fourthline.vision.internal;

import android.media.Image;
import com.fourthline.core.internal.Try;
import com.fourthline.vision.document.internal.domain.step.VisionDynamicStepsEvaluator;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public abstract class i implements w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function0 f36341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final VisionDynamicStepsEvaluator f36342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f36343c;
    private Iterator d;
    private td e;

    public i(@NotNull Function0<? extends List<? extends td>> subStepsFactory, VisionDynamicStepsEvaluator<Object> visionDynamicStepsEvaluator) {
        Intrinsics.checkNotNullParameter(subStepsFactory, "subStepsFactory");
        this.f36341a = subStepsFactory;
        this.f36342b = visionDynamicStepsEvaluator;
        Iterator<td> it8 = getSubSteps().iterator();
        this.d = it8;
        this.e = it8.next();
    }

    public static /* synthetic */ <SCANNER_STEP> Object process$suspendImpl(i iVar, Image image, Continuation<? super Try<? extends ud>> continuation) {
        return iVar.e.process(image, continuation);
    }

    @NotNull
    public final td getCurrentStep() {
        return this.e;
    }

    @Override // com.fourthline.vision.internal.w1, com.fourthline.vision.internal.td
    @NotNull
    public sd getStepConfig() {
        return this.e.getStepConfig();
    }

    @Override // com.fourthline.vision.internal.w1
    public int getStepsCount() {
        return getSubSteps().size();
    }

    @NotNull
    public final List<td> getSubSteps() {
        return (List) this.f36341a.invoke();
    }

    @Override // com.fourthline.vision.internal.td, com.fourthline.vision.internal.t1
    public boolean isCompleted() {
        return this.f36343c;
    }

    @Override // com.fourthline.vision.internal.w1
    public void moveToNext() {
        this.e.stop();
        Unit unit = Unit.f186387a;
        VisionDynamicStepsEvaluator visionDynamicStepsEvaluator = this.f36342b;
        if (visionDynamicStepsEvaluator != null && visionDynamicStepsEvaluator.isScannerCompleted(this.e.getStepConfig().getStepType())) {
            setCompleted(true);
        } else {
            if (!this.d.hasNext()) {
                setCompleted(true);
                return;
            }
            td tdVar = (td) this.d.next();
            tdVar.start();
            this.e = tdVar;
        }
    }

    public Object process(@NotNull Image image, @NotNull Continuation<? super Try<? extends ud>> continuation) {
        return process$suspendImpl(this, image, continuation);
    }

    @Override // com.fourthline.vision.internal.w1
    public void reset() {
        this.e.stop();
        setCompleted(false);
        Iterator<td> it8 = getSubSteps().iterator();
        this.d = it8;
        td next = it8.next();
        next.start();
        this.e = next;
    }

    @Override // com.fourthline.vision.internal.w1
    public abstract /* synthetic */ void resetStep();

    public void setCompleted(boolean z) {
        this.f36343c = z;
    }

    public final void setCurrentStep(@NotNull td tdVar) {
        Intrinsics.checkNotNullParameter(tdVar, "<set-?>");
        this.e = tdVar;
    }

    @Override // com.fourthline.vision.internal.td, com.fourthline.vision.internal.q7, com.fourthline.vision.internal.pd
    public void start() {
        this.e.start();
    }

    @Override // com.fourthline.vision.internal.td, com.fourthline.vision.internal.q7, com.fourthline.vision.internal.pd
    public void stop() {
        this.e.stop();
    }

    @Override // com.fourthline.vision.internal.td, com.fourthline.vision.internal.q7
    public /* bridge */ /* synthetic */ Object process(Object obj2, Continuation continuation) {
        return process((Image) obj2, (Continuation<? super Try<? extends ud>>) continuation);
    }

    public /* synthetic */ i(Function0 function0, VisionDynamicStepsEvaluator visionDynamicStepsEvaluator, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0, (i & 2) != 0 ? null : visionDynamicStepsEvaluator);
    }
}
