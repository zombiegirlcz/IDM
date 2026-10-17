package kvh;

import com.revolut.feature.workflow.engine.shared.data.WorkflowException;
import com.revolut.feature.workflow.engine.shared.data.WorkflowFormException;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import zhm.z0;

/* JADX INFO: loaded from: classes10.dex */
public final class g {
    private g() {
    }

    public static void a(String str, Throwable th10) {
        Set setG = z0.g(new Pair("feature", "onboarding"));
        RuntimeException runtimeException = new RuntimeException(str, th10);
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, runtimeException, setG);
    }

    public static void b(String str, String str2, String str3, Throwable th10) {
        Set setG = z0.g(new Pair("feature", ib.b.Workflow));
        if (th10 instanceof WorkflowFormException) {
            WorkflowFormException workflowFormException = (WorkflowFormException) th10;
            setG.add(new Pair("form_id", workflowFormException.e));
            setG.add(new Pair("step_id", workflowFormException.d));
            String str4 = workflowFormException.f96611c;
            if (str4 != null) {
                setG.add(new Pair("workflow_id", str4));
            }
        } else {
            if (str2 != null) {
                setG.add(new Pair("workflow_id", str2));
            }
            if (str3 != null) {
                setG.add(new Pair("step_id", str3));
            }
        }
        WorkflowException workflowException = new WorkflowException(str, th10);
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, workflowException, setG);
    }

    public static /* synthetic */ void c(g gVar, String str, Throwable th10, String str2, int i) {
        if ((i & 8) != 0) {
            str2 = null;
        }
        gVar.getClass();
        b(str, null, str2, th10);
    }
}
