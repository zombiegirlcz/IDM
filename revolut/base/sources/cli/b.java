package cli;

import android.app.Activity;
import androidx.core.app.ActivityCompat;
import ch.qos.logback.core.CoreConstants;
import com.revolut.core.ui_kit.delegates.chat.ChatAttachmentGridBubbleDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.EnumDescriptor;
import tw0.l0;
import y80.b;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f25018c;
    public final /* synthetic */ Object d;

    public /* synthetic */ b(int i, int i2, Serializable serializable, Object obj2) {
        this.f25016a = i2;
        this.f25017b = i;
        this.f25018c = serializable;
        this.d = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f25016a) {
            case 0:
                c cVar = (c) this.f25018c;
                int i = this.f25017b;
                Function0 function0 = (Function0) this.d;
                int i2 = i + 1;
                aim.e eVar = cVar.f25019a;
                if (i2 >= eVar.size()) {
                    function0.invoke();
                } else {
                    ((r) eVar.get(i2)).a(new b(cVar, i2, function0));
                }
                break;
            case 1:
                ((k6a.s) this.f25018c).X1(new mii.i((String) this.d, new TextLocalisedClause(this.f25017b, null, null, 14), null, null, 28));
                break;
            case 2:
                ((ChatAttachmentGridBubbleDelegate) this.f25018c).k.onNext(new com.revolut.core.ui_kit.delegates.chat.b((ChatAttachmentGridBubbleDelegate.Model) this.d, this.f25017b));
                break;
            case 3:
                int i3 = this.f25017b;
                String str = (String) this.f25018c;
                EnumDescriptor enumDescriptor = (EnumDescriptor) this.d;
                SerialDescriptor[] serialDescriptorArr = new SerialDescriptor[i3];
                for (int i5 = 0; i5 < i3; i5++) {
                    serialDescriptorArr[i5] = com.bumptech.glide.c.e(str + CoreConstants.DOT + enumDescriptor.e[i5], olm.k.e, new SerialDescriptor[0], new okk.d(13));
                }
                break;
            case 4:
                int i6 = this.f25017b;
                Ref$IntRef ref$IntRef = (Ref$IntRef) this.f25018c;
                l0 l0Var = (l0) this.d;
                if (i6 == ref$IntRef.f186408a) {
                    l0Var.f274843r = true;
                }
                break;
            default:
                Activity activity = (Activity) this.f25018c;
                String[] strArr = (String[]) this.d;
                int i21 = this.f25017b;
                b.a aVar = y80.b.Companion;
                ActivityCompat.requestPermissions(activity, strArr, i21);
                break;
        }
        return Unit.f186387a;
    }

    public /* synthetic */ b(c cVar, int i, Function0 function0) {
        this.f25016a = 0;
        this.f25018c = cVar;
        this.f25017b = i;
        this.d = function0;
    }

    public /* synthetic */ b(Object obj2, Object obj3, int i, int i2) {
        this.f25016a = i2;
        this.f25018c = obj2;
        this.d = obj3;
        this.f25017b = i;
    }
}
