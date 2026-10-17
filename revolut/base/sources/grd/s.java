package grd;

import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.r0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class s implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f146010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f146011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f146012c;

    public /* synthetic */ s(int i, String str, Object obj2) {
        this.f146010a = i;
        this.f146011b = str;
        this.f146012c = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f146010a) {
            case 0:
                a update = (a) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return a.a(update, null, r0.q(update.d, new Pair(this.f146011b, this.f146012c)), null, null, null, null, false, null, null, null, 32759);
            case 1:
                a update2 = (a) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return a.a(update2, null, null, r0.q(update2.e, new Pair(this.f146011b, this.f146012c)), null, null, null, false, null, null, null, 32751);
            case 2:
                wg9.k update3 = (wg9.k) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                List inputs = update3.f297250c;
                ArrayList formFields = update3.f297248a;
                Intrinsics.checkNotNullParameter(inputs, "inputs");
                String fieldName = this.f146011b;
                Intrinsics.checkNotNullParameter(fieldName, "fieldName");
                Object newValue = this.f146012c;
                Intrinsics.checkNotNullParameter(newValue, "newValue");
                Intrinsics.checkNotNullParameter(formFields, "formFields");
                return wg9.k.a(update3, null, of9.c.c(of9.c.a(newValue, fieldName, inputs), formFields), null, null, null, 123);
            default:
                yg9.k update4 = (yg9.k) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                List inputs2 = update4.f313584c;
                ArrayList formFields2 = update4.f313582a.f61360a;
                Intrinsics.checkNotNullParameter(inputs2, "inputs");
                String fieldName2 = this.f146011b;
                Intrinsics.checkNotNullParameter(fieldName2, "fieldName");
                Object newValue2 = this.f146012c;
                Intrinsics.checkNotNullParameter(newValue2, "newValue");
                Intrinsics.checkNotNullParameter(formFields2, "formFields");
                return yg9.k.a(update4, null, of9.c.c(of9.c.a(newValue2, fieldName2, inputs2), formFields2), null, null, 123);
        }
    }
}
