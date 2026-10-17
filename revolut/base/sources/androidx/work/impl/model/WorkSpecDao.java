package androidx.work.impl.model;

import androidx.work.Data;
import androidx.work.WorkInfo;
import androidx.work.impl.model.WorkSpec;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0018\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\r\u001a\u00020\u0007H'¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\u0019\u0010\nJ\u001f\u0010\u001c\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001aH'¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u001eH'¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\"\u0010\u0018J\u0017\u0010#\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b#\u0010\u0018J\u001f\u0010%\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u0014H'¢\u0006\u0004\b%\u0010&J\u0019\u0010'\u001a\u0004\u0018\u00010\u00122\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b'\u0010(J\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u000e2\u0006\u0010\r\u001a\u00020\u0007H'¢\u0006\u0004\b*\u0010\u0011J\u001d\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000e2\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b+\u0010\u0011J\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e2\u0006\u0010,\u001a\u00020\u0007H'¢\u0006\u0004\b-\u0010\u0011J\u001d\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e2\u0006\u0010\r\u001a\u00020\u0007H'¢\u0006\u0004\b.\u0010\u0011J\u0015\u00101\u001a\b\u0012\u0004\u0012\u0002000/H'¢\u0006\u0004\b1\u00102J\u001f\u00104\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\u00072\u0006\u00103\u001a\u00020\u001eH'¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u0014H'¢\u0006\u0004\b6\u00107J\u001d\u00109\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u00108\u001a\u00020\u0014H'¢\u0006\u0004\b9\u0010:J\u0015\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH'¢\u0006\u0004\b;\u0010<J\u001d\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010=\u001a\u00020\u0014H'¢\u0006\u0004\b>\u0010:J\u0015\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH'¢\u0006\u0004\b?\u0010<J\u0015\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH'¢\u0006\u0004\b@\u0010<J\u001d\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010A\u001a\u00020\u001eH'¢\u0006\u0004\bB\u0010CJ\u0017\u0010D\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\bD\u0010\u0006J\u000f\u0010E\u001a\u00020\u0014H'¢\u0006\u0004\bE\u00107J\u001f\u0010G\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010F\u001a\u00020\u0014H'¢\u0006\u0004\bG\u0010&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006HÀ\u0006\u0001"}, d2 = {"Landroidx/work/impl/model/WorkSpecDao;", "", "Landroidx/work/impl/model/WorkSpec;", "workSpec", "", "insertWorkSpec", "(Landroidx/work/impl/model/WorkSpec;)V", "", "id", "delete", "(Ljava/lang/String;)V", "getWorkSpec", "(Ljava/lang/String;)Landroidx/work/impl/model/WorkSpec;", "name", "", "Landroidx/work/impl/model/WorkSpec$IdAndState;", "getWorkSpecIdAndStatesForName", "(Ljava/lang/String;)Ljava/util/List;", "Landroidx/work/WorkInfo$State;", "state", "", "setState", "(Landroidx/work/WorkInfo$State;Ljava/lang/String;)I", "setCancelledState", "(Ljava/lang/String;)I", "incrementPeriodCount", "Landroidx/work/Data;", "output", "setOutput", "(Ljava/lang/String;Landroidx/work/Data;)V", "", "enqueueTime", "setLastEnqueueTime", "(Ljava/lang/String;J)V", "incrementWorkSpecRunAttemptCount", "resetWorkSpecRunAttemptCount", "overrideGeneration", "resetWorkSpecNextScheduleTimeOverride", "(Ljava/lang/String;I)V", "getState", "(Ljava/lang/String;)Landroidx/work/WorkInfo$State;", "Landroidx/work/impl/model/WorkSpec$WorkInfoPojo;", "getWorkStatusPojoForName", "getInputsFromPrerequisites", "tag", "getUnfinishedWorkWithTag", "getUnfinishedWorkWithName", "Lkotlinx/coroutines/flow/Flow;", "", "hasUnfinishedWorkFlow", "()Lkotlinx/coroutines/flow/Flow;", "startTime", "markWorkSpecScheduled", "(Ljava/lang/String;J)I", "resetScheduledState", "()I", "schedulerLimit", "getEligibleWorkForScheduling", "(I)Ljava/util/List;", "getEligibleWorkForSchedulingWithContentUris", "()Ljava/util/List;", "maxLimit", "getAllEligibleWorkSpecsForScheduling", "getScheduledWork", "getRunningWork", "startingAt", "getRecentlyCompletedWork", "(J)Ljava/util/List;", "updateWorkSpec", "countNonFinishedContentUriTriggerWorkers", "stopReason", "setStopReason", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface WorkSpecDao {
    int countNonFinishedContentUriTriggerWorkers();

    void delete(@NotNull String id10);

    @NotNull
    List<WorkSpec> getAllEligibleWorkSpecsForScheduling(int maxLimit);

    @NotNull
    List<WorkSpec> getEligibleWorkForScheduling(int schedulerLimit);

    @NotNull
    List<WorkSpec> getEligibleWorkForSchedulingWithContentUris();

    @NotNull
    List<Data> getInputsFromPrerequisites(@NotNull String id10);

    @NotNull
    List<WorkSpec> getRecentlyCompletedWork(long startingAt);

    @NotNull
    List<WorkSpec> getRunningWork();

    @NotNull
    List<WorkSpec> getScheduledWork();

    WorkInfo.State getState(@NotNull String id10);

    @NotNull
    List<String> getUnfinishedWorkWithName(@NotNull String name);

    @NotNull
    List<String> getUnfinishedWorkWithTag(@NotNull String tag2);

    WorkSpec getWorkSpec(@NotNull String id10);

    @NotNull
    List<WorkSpec.IdAndState> getWorkSpecIdAndStatesForName(@NotNull String name);

    @NotNull
    List<WorkSpec.WorkInfoPojo> getWorkStatusPojoForName(@NotNull String name);

    @NotNull
    Flow hasUnfinishedWorkFlow();

    void incrementPeriodCount(@NotNull String id10);

    int incrementWorkSpecRunAttemptCount(@NotNull String id10);

    void insertWorkSpec(@NotNull WorkSpec workSpec);

    int markWorkSpecScheduled(@NotNull String id10, long startTime);

    int resetScheduledState();

    void resetWorkSpecNextScheduleTimeOverride(@NotNull String id10, int overrideGeneration);

    int resetWorkSpecRunAttemptCount(@NotNull String id10);

    int setCancelledState(@NotNull String id10);

    void setLastEnqueueTime(@NotNull String id10, long enqueueTime);

    void setOutput(@NotNull String id10, @NotNull Data output);

    int setState(@NotNull WorkInfo.State state, @NotNull String id10);

    void setStopReason(@NotNull String id10, int stopReason);

    void updateWorkSpec(@NotNull WorkSpec workSpec);
}
