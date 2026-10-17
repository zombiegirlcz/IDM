package e09;

import aii.e;
import aii.g;
import aii.p;
import aii.u;
import com.revolut.feature.learn.shared.api.navigation.LearnKompotFeatureConfig;
import com.revolut.feature.learn.shared.api.navigation.LearnKompotFeatureConfig$Lesson$Destination;
import com.revolut.feature.learn.shared.impl.ui.course.overview.CourseOverviewScreen;
import com.revolut.feature.learn.shared.impl.ui.course.overview.CourseOverviewScreenContract$InputData;
import com.revolut.feature.learn.shared.impl.ui.lesson.LessonScreen;
import com.revolut.feature.learn.shared.impl.ui.lesson.LessonScreenContract$InputData;
import com.revolut.kompot.common.flow.WrapperFlowImpl;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f121471a;

    public c(Set deeplinkGateways) {
        Intrinsics.checkNotNullParameter(deeplinkGateways, "deeplinkGateways");
        this.f121471a = deeplinkGateways;
    }

    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof LearnKompotFeatureConfig.CourseOverview.Destination) {
            LearnKompotFeatureConfig.CourseOverview.Destination destination = (LearnKompotFeatureConfig.CourseOverview.Destination) descriptor;
            CourseOverviewScreen controller = new CourseOverviewScreen(new CourseOverviewScreenContract$InputData(destination.f77965b, destination.f77966c, destination.d));
            aab.b resultHandler = new aab.b(8);
            Intrinsics.checkNotNullParameter(controller, "controller");
            Intrinsics.checkNotNullParameter(resultHandler, "resultHandler");
            return destination.a(new WrapperFlowImpl(controller, resultHandler));
        }
        if (!(descriptor instanceof LearnKompotFeatureConfig$Lesson$Destination)) {
            return null;
        }
        LearnKompotFeatureConfig$Lesson$Destination learnKompotFeatureConfig$Lesson$Destination = (LearnKompotFeatureConfig$Lesson$Destination) descriptor;
        LessonScreen controller2 = new LessonScreen(new LessonScreenContract$InputData(learnKompotFeatureConfig$Lesson$Destination.f77971a, learnKompotFeatureConfig$Lesson$Destination.f77972b));
        aab.b resultHandler2 = new aab.b(9);
        Intrinsics.checkNotNullParameter(controller2, "controller");
        Intrinsics.checkNotNullParameter(resultHandler2, "resultHandler");
        return learnKompotFeatureConfig$Lesson$Destination.a(new WrapperFlowImpl(controller2, resultHandler2));
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof LearnKompotFeatureConfig.CourseOverview.Destination) {
            LearnKompotFeatureConfig.CourseOverview.Destination destination2 = (LearnKompotFeatureConfig.CourseOverview.Destination) destination;
            return new CourseOverviewScreen(new CourseOverviewScreenContract$InputData(destination2.f77965b, destination2.f77966c, destination2.d));
        }
        if (!(destination instanceof LearnKompotFeatureConfig$Lesson$Destination)) {
            return null;
        }
        LearnKompotFeatureConfig$Lesson$Destination learnKompotFeatureConfig$Lesson$Destination = (LearnKompotFeatureConfig$Lesson$Destination) destination;
        return new LessonScreen(new LessonScreenContract$InputData(learnKompotFeatureConfig$Lesson$Destination.f77971a, learnKompotFeatureConfig$Lesson$Destination.f77972b));
    }

    @Override // aii.p
    public final Set h() {
        return this.f121471a;
    }
}
