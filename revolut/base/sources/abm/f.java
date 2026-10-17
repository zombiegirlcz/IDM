package abm;

import android.graphics.BitmapFactory;
import android.widget.FrameLayout;
import androidx.lifecycle.ViewModelStoreOwner;
import com.onfido.workflow.internal.ui.WorkflowLoadingFragment;
import com.onfido.workflow.internal.ui.retry.RetryWorkflowFragment;
import com.onfido.workflow.internal.ui.retry.RetryWorkflowViewDescriptor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes21.dex */
public final class f extends u implements Function0 {
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f2996h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj2, int i) {
        super(0);
        this.f = i;
        this.f2996h = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.u] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f) {
            case 0:
                ((u) this.f2996h).invoke();
                return Unit.f186387a;
            case 1:
                BitmapFactory.Options options = new BitmapFactory.Options();
                h hVar = (h) this.f2996h;
                options.inJustDecodeBounds = true;
                byte[] bArr = hVar.f2997a;
                BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
                return options;
            case 2:
                return new FrameLayout(((cam.b) this.f2996h).f22666a);
            case 3:
                return (WorkflowLoadingFragment) this.f2996h;
            case 4:
                return (ViewModelStoreOwner) ((f) this.f2996h).invoke();
            default:
                RetryWorkflowViewDescriptor retryWorkflowViewDescriptor = (RetryWorkflowViewDescriptor) ((RetryWorkflowFragment) this.f2996h).requireArguments().getParcelable("key_descriptor");
                if (retryWorkflowViewDescriptor != null) {
                    return retryWorkflowViewDescriptor;
                }
                throw new IllegalArgumentException(j6.a.q("RetryWorkflowFragment can't work without a ", o0.f186429a.b(RetryWorkflowViewDescriptor.class).m()).toString());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f(Function0 function0) {
        super(0);
        this.f = 0;
        this.f2996h = (u) function0;
    }
}
