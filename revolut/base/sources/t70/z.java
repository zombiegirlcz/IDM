package t70;

import android.os.Handler;
import android.os.Looper;
import android.text.Annotation;
import android.text.Spanned;
import com.revolut.core.android.localization.DynamicResourceAnnotationValidationException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class z extends r {

    @NotNull
    public static final y Companion = new y();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f268407b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(a resources, String appPackageName) {
        super(resources);
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(appPackageName, "appPackageName");
        this.f268407b = appPackageName;
    }

    public final void a(int i, String resourceName, Function1 function1) {
        if (i != 0 && Intrinsics.f(getResourcePackageName(i), this.f268407b)) {
            CharSequence charSequence = (CharSequence) function1.invoke(Integer.valueOf(i));
            if (charSequence instanceof Spanned) {
                Object[] spans = ((Spanned) charSequence).getSpans(0, charSequence.length(), Annotation.class);
                Intrinsics.checkNotNullExpressionValue(spans, "getSpans(...)");
                for (Object obj2 : spans) {
                    if (Intrinsics.f(((Annotation) obj2).getValue(), "dynamic")) {
                        return;
                    }
                }
            }
            Intrinsics.checkNotNullParameter(resourceName, "resourceName");
            new Handler(Looper.getMainLooper()).post(new x(new DynamicResourceAnnotationValidationException(p.a.p("Dynamic resource '", resourceName, "' is expected to be in a separate LSS file ending in '_dynamic.xml'")), 0));
        }
    }

    @Override // t70.r, android.content.res.Resources
    public final int getIdentifier(String name, String str, String str2) {
        Intrinsics.checkNotNullParameter(name, "name");
        int identifier = super.getIdentifier(name, str, str2);
        if (Intrinsics.f(str, c.STRING.a())) {
            final int i = 0;
            a(identifier, name, new Function1(this) { // from class: t70.w

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ z f268404b;

                {
                    this.f268404b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    int i2 = i;
                    int iIntValue = ((Integer) obj2).intValue();
                    switch (i2) {
                        case 0:
                            return this.f268404b.getText(iIntValue);
                        default:
                            return this.f268404b.getQuantityText(iIntValue, 1);
                    }
                }
            });
            return identifier;
        }
        if (Intrinsics.f(str, c.PLURALS.a())) {
            final int i2 = 1;
            a(identifier, name, new Function1(this) { // from class: t70.w

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ z f268404b;

                {
                    this.f268404b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    int i22 = i2;
                    int iIntValue = ((Integer) obj2).intValue();
                    switch (i22) {
                        case 0:
                            return this.f268404b.getText(iIntValue);
                        default:
                            return this.f268404b.getQuantityText(iIntValue, 1);
                    }
                }
            });
        }
        return identifier;
    }
}
