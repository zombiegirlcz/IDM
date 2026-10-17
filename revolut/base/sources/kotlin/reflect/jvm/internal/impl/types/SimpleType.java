package kotlin.reflect.jvm.internal.impl.types;

import java.io.IOException;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker;
import org.jetbrains.annotations.NotNull;
import zhm.d0;

/* JADX INFO: loaded from: classes13.dex */
public abstract class SimpleType extends UnwrappedType implements SimpleTypeMarker, TypeArgumentListMarker {
    public SimpleType() {
        super(null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    public abstract SimpleType makeNullableAsSpecified(boolean z);

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    public abstract SimpleType replaceAttributes(@NotNull TypeAttributes typeAttributes);

    @NotNull
    public String toString() throws IOException {
        StringBuilder sb6 = new StringBuilder();
        Iterator<AnnotationDescriptor> it8 = getAnnotations().iterator();
        while (it8.hasNext()) {
            String[] value = {"[", DescriptorRenderer.renderAnnotation$default(DescriptorRenderer.DEBUG_TEXT, it8.next(), null, 2, null), "] "};
            Intrinsics.checkNotNullParameter(sb6, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            for (int i = 0; i < 3; i++) {
                sb6.append(value[i]);
            }
        }
        sb6.append(getConstructor());
        if (!getArguments().isEmpty()) {
            d0.j0(getArguments(), sb6, ", ", "<", ">", null, 112);
        }
        if (isMarkedNullable()) {
            sb6.append("?");
        }
        return sb6.toString();
    }
}
