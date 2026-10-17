package androidx.glance.appwidget;

import androidx.glance.BackgroundModifier;
import androidx.glance.Emittable;
import androidx.glance.EmittableImage;
import androidx.glance.EmittableWithChildren;
import androidx.glance.GlanceModifier;
import androidx.glance.ImageKt;
import androidx.glance.ImageProvider;
import androidx.glance.action.Action;
import androidx.glance.action.ActionModifier;
import androidx.glance.action.LambdaAction;
import androidx.glance.layout.EmittableBox;
import androidx.glance.layout.HeightModifier;
import androidx.glance.layout.SizeModifiersKt;
import androidx.glance.layout.WidthModifier;
import androidx.glance.unit.Dimension;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;
import v0.a;
import zhm.a0;
import zhm.v;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\t\u001a\u00020\u0002*\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\b\u001a'\u0010\r\u001a\u00020\u0002*\u00020\u00052\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a%\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u000f*\u00020\u0005H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a!\u0010\u0017\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00150\u0016*\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0013\u0010\u0019\u001a\u00020\u000b*\u00020\u000bH\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0013\u0010\u001c\u001a\u00020\u001b*\u00020\u000bH\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0013\u0010\u001f\u001a\u00020\u001e*\u00020\u0015H\u0002¢\u0006\u0004\b\u001f\u0010 \u001a\u0013\u0010!\u001a\u00020\u0002*\u00020\u0015H\u0002¢\u0006\u0004\b!\u0010\"\u001a\u001b\u0010$\u001a\u00020\u0015*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150#H\u0002¢\u0006\u0004\b$\u0010%¨\u0006&"}, d2 = {"Landroidx/glance/appwidget/RemoteViewsRoot;", "root", "", "normalizeCompositionTree", "(Landroidx/glance/appwidget/RemoteViewsRoot;)V", "Landroidx/glance/EmittableWithChildren;", "container", "coerceToOneChild", "(Landroidx/glance/EmittableWithChildren;)V", "normalizeSizes", "Lkotlin/Function1;", "Landroidx/glance/Emittable;", "block", "transformTree", "(Landroidx/glance/EmittableWithChildren;Lkotlin/jvm/functions/Function1;)V", "", "", "", "Landroidx/glance/action/LambdaAction;", "updateLambdaActionKeys", "(Landroidx/glance/EmittableWithChildren;)Ljava/util/Map;", "Landroidx/glance/GlanceModifier;", "Lkotlin/Pair;", "extractLambdaAction", "(Landroidx/glance/GlanceModifier;)Lkotlin/Pair;", "transformBackgroundImageAndActionRipple", "(Landroidx/glance/Emittable;)Landroidx/glance/Emittable;", "", "hasBuiltinRipple", "(Landroidx/glance/Emittable;)Z", "Landroidx/glance/appwidget/ExtractedSizeModifiers;", "extractSizeAndCornerRadiusModifiers", "(Landroidx/glance/GlanceModifier;)Landroidx/glance/appwidget/ExtractedSizeModifiers;", "warnIfMultipleClickableActions", "(Landroidx/glance/GlanceModifier;)V", "", "collect", "(Ljava/util/List;)Landroidx/glance/GlanceModifier;", "glance-appwidget_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class NormalizeCompositionTreeKt {

    /* JADX INFO: renamed from: androidx.glance.appwidget.NormalizeCompositionTreeKt$extractSizeAndCornerRadiusModifiers$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/glance/GlanceModifier$Element;", "invoke", "(Landroidx/glance/GlanceModifier$Element;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass1 extends u implements Function1<GlanceModifier.Element, Boolean> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Boolean invoke(@NotNull GlanceModifier.Element element) {
            return Boolean.valueOf((element instanceof WidthModifier) || (element instanceof HeightModifier) || (element instanceof CornerRadiusModifier));
        }
    }

    /* JADX INFO: renamed from: androidx.glance.appwidget.NormalizeCompositionTreeKt$extractSizeAndCornerRadiusModifiers$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Landroidx/glance/appwidget/ExtractedSizeModifiers;", "acc", "modifier", "Landroidx/glance/GlanceModifier$Element;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass2 extends u implements Function2<ExtractedSizeModifiers, GlanceModifier.Element, ExtractedSizeModifiers> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final ExtractedSizeModifiers invoke(@NotNull ExtractedSizeModifiers extractedSizeModifiers, @NotNull GlanceModifier.Element element) {
            return ((element instanceof WidthModifier) || (element instanceof HeightModifier) || (element instanceof CornerRadiusModifier)) ? ExtractedSizeModifiers.copy$default(extractedSizeModifiers, extractedSizeModifiers.getSizeModifiers().then(element), null, 2, null) : ExtractedSizeModifiers.copy$default(extractedSizeModifiers, null, extractedSizeModifiers.getNonSizeModifiers().then(element), 1, null);
        }
    }

    /* JADX INFO: renamed from: androidx.glance.appwidget.NormalizeCompositionTreeKt$normalizeCompositionTree$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroidx/glance/Emittable;", "view", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class C19421 extends u implements Function1<Emittable, Emittable> {
        public static final C19421 INSTANCE = new C19421();

        public C19421() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Emittable invoke(@NotNull Emittable emittable) {
            return NormalizeCompositionTreeKt.transformBackgroundImageAndActionRipple(emittable);
        }
    }

    private static final void coerceToOneChild(EmittableWithChildren emittableWithChildren) {
        if (!emittableWithChildren.getChildren().isEmpty()) {
            List<Emittable> children = emittableWithChildren.getChildren();
            if (!(children instanceof Collection) || !children.isEmpty()) {
                Iterator<T> it8 = children.iterator();
                while (it8.hasNext()) {
                    if (!(((Emittable) it8.next()) instanceof EmittableSizeBox)) {
                    }
                }
            }
            for (Emittable emittable : emittableWithChildren.getChildren()) {
                Intrinsics.i(emittable, "null cannot be cast to non-null type androidx.glance.appwidget.EmittableSizeBox");
                EmittableSizeBox emittableSizeBox = (EmittableSizeBox) emittable;
                if (emittableSizeBox.getChildren().size() != 1) {
                    EmittableBox emittableBox = new EmittableBox();
                    a0.x(emittableSizeBox.getChildren(), emittableBox.getChildren());
                    emittableSizeBox.getChildren().clear();
                    emittableSizeBox.getChildren().add(emittableBox);
                }
            }
            return;
        }
        if (emittableWithChildren.getChildren().size() == 1) {
            return;
        }
        EmittableBox emittableBox2 = new EmittableBox();
        a0.x(emittableWithChildren.getChildren(), emittableBox2.getChildren());
        emittableWithChildren.getChildren().clear();
        emittableWithChildren.getChildren().add(emittableBox2);
    }

    private static final GlanceModifier collect(List<GlanceModifier> list) {
        GlanceModifier glanceModifierThen;
        GlanceModifier.Companion companion = GlanceModifier.INSTANCE;
        for (GlanceModifier glanceModifier : list) {
            if (glanceModifier != null && (glanceModifierThen = companion.then(glanceModifier)) != null) {
                companion = glanceModifierThen;
            }
        }
        return companion;
    }

    private static final Pair<LambdaAction, GlanceModifier> extractLambdaAction(GlanceModifier glanceModifier) {
        Pair pair = glanceModifier.any(NormalizeCompositionTreeKt$extractLambdaAction$$inlined$extractModifier$1.INSTANCE) ? (Pair) glanceModifier.foldIn(new Pair(null, GlanceModifier.INSTANCE), NormalizeCompositionTreeKt$extractLambdaAction$$inlined$extractModifier$2.INSTANCE) : new Pair(null, glanceModifier);
        ActionModifier actionModifier = (ActionModifier) pair.f186385a;
        GlanceModifier glanceModifier2 = (GlanceModifier) pair.f186386b;
        Action action = actionModifier != null ? actionModifier.getAction() : null;
        return action instanceof LambdaAction ? new Pair<>(action, glanceModifier2) : new Pair<>(null, glanceModifier2);
    }

    private static final ExtractedSizeModifiers extractSizeAndCornerRadiusModifiers(GlanceModifier glanceModifier) {
        return glanceModifier.any(AnonymousClass1.INSTANCE) ? (ExtractedSizeModifiers) glanceModifier.foldIn(new ExtractedSizeModifiers(null, null, 3, null), AnonymousClass2.INSTANCE) : new ExtractedSizeModifiers(null, glanceModifier, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean hasBuiltinRipple(Emittable emittable) {
        return false;
    }

    public static final void normalizeCompositionTree(@NotNull RemoteViewsRoot remoteViewsRoot) {
        coerceToOneChild(remoteViewsRoot);
        normalizeSizes(remoteViewsRoot);
        transformTree(remoteViewsRoot, C19421.INSTANCE);
    }

    private static final void normalizeSizes(EmittableWithChildren emittableWithChildren) {
        Dimension height;
        Dimension width;
        for (Emittable emittable : emittableWithChildren.getChildren()) {
            if (emittable instanceof EmittableWithChildren) {
                normalizeSizes((EmittableWithChildren) emittable);
            }
        }
        HeightModifier heightModifier = (HeightModifier) emittableWithChildren.getModifier().foldIn(null, NormalizeCompositionTreeKt$normalizeSizes$$inlined$findModifier$1.INSTANCE);
        if (heightModifier == null || (height = heightModifier.getHeight()) == null) {
            height = Dimension.Wrap.INSTANCE;
        }
        if (height instanceof Dimension.Wrap) {
            List<Emittable> children = emittableWithChildren.getChildren();
            if (!(children instanceof Collection) || !children.isEmpty()) {
                Iterator<T> it8 = children.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        break;
                    }
                    HeightModifier heightModifier2 = (HeightModifier) ((Emittable) it8.next()).getModifier().foldIn(null, NormalizeCompositionTreeKt$normalizeSizes$lambda$2$$inlined$findModifier$1.INSTANCE);
                    if ((heightModifier2 != null ? heightModifier2.getHeight() : null) instanceof Dimension.Fill) {
                        emittableWithChildren.setModifier(SizeModifiersKt.fillMaxHeight(emittableWithChildren.getModifier()));
                        break;
                    }
                }
            }
        }
        WidthModifier widthModifier = (WidthModifier) emittableWithChildren.getModifier().foldIn(null, NormalizeCompositionTreeKt$normalizeSizes$$inlined$findModifier$2.INSTANCE);
        if (widthModifier == null || (width = widthModifier.getWidth()) == null) {
            width = Dimension.Wrap.INSTANCE;
        }
        if (width instanceof Dimension.Wrap) {
            List<Emittable> children2 = emittableWithChildren.getChildren();
            if ((children2 instanceof Collection) && children2.isEmpty()) {
                return;
            }
            Iterator<T> it9 = children2.iterator();
            while (it9.hasNext()) {
                WidthModifier widthModifier2 = (WidthModifier) ((Emittable) it9.next()).getModifier().foldIn(null, NormalizeCompositionTreeKt$normalizeSizes$lambda$3$$inlined$findModifier$1.INSTANCE);
                if ((widthModifier2 != null ? widthModifier2.getWidth() : null) instanceof Dimension.Fill) {
                    emittableWithChildren.setModifier(SizeModifiersKt.fillMaxWidth(emittableWithChildren.getModifier()));
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Emittable transformBackgroundImageAndActionRipple(Emittable emittable) {
        EmittableImage emittableImage;
        if ((emittable instanceof EmittableSizeBox) || !emittable.getModifier().any(new NormalizeCompositionTreeKt$transformBackgroundImageAndActionRipple$shouldWrapTargetInABox$1(false, emittable))) {
            return emittable;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        GlanceModifier modifier = emittable.getModifier();
        EmittableImage emittableImage2 = null;
        Pair pair = modifier.any(NormalizeCompositionTreeKt$transformBackgroundImageAndActionRipple$$inlined$extractModifier$1.INSTANCE) ? (Pair) modifier.foldIn(new Pair(null, GlanceModifier.INSTANCE), NormalizeCompositionTreeKt$transformBackgroundImageAndActionRipple$$inlined$extractModifier$2.INSTANCE) : new Pair(null, modifier);
        BackgroundModifier backgroundModifier = (BackgroundModifier) pair.f186385a;
        GlanceModifier glanceModifier = (GlanceModifier) pair.f186386b;
        if (backgroundModifier == null) {
            emittableImage = null;
        } else if (backgroundModifier.getImageProvider() != null) {
            emittableImage = new EmittableImage();
            emittableImage.setModifier(SizeModifiersKt.fillMaxSize(GlanceModifier.INSTANCE));
            emittableImage.setProvider(backgroundModifier.getImageProvider());
            emittableImage.m3484setContentScaleHwT0Evw(backgroundModifier.getContentScale());
        } else {
            arrayList2.add(backgroundModifier);
            emittableImage = null;
        }
        warnIfMultipleClickableActions(glanceModifier);
        Pair pair2 = glanceModifier.any(NormalizeCompositionTreeKt$transformBackgroundImageAndActionRipple$$inlined$extractModifier$3.INSTANCE) ? (Pair) glanceModifier.foldIn(new Pair(null, GlanceModifier.INSTANCE), NormalizeCompositionTreeKt$transformBackgroundImageAndActionRipple$$inlined$extractModifier$4.INSTANCE) : new Pair(null, glanceModifier);
        ActionModifier actionModifier = (ActionModifier) pair2.f186385a;
        GlanceModifier glanceModifier2 = (GlanceModifier) pair2.f186386b;
        arrayList.add(actionModifier);
        if (actionModifier != null && !hasBuiltinRipple(emittable)) {
            ImageProvider ImageProvider = ImageKt.ImageProvider(R$drawable.glance_ripple);
            emittableImage2 = new EmittableImage();
            emittableImage2.setModifier(SizeModifiersKt.fillMaxSize(GlanceModifier.INSTANCE));
            emittableImage2.setProvider(ImageProvider);
        }
        ExtractedSizeModifiers extractedSizeModifiersExtractSizeAndCornerRadiusModifiers = extractSizeAndCornerRadiusModifiers(glanceModifier2);
        GlanceModifier sizeModifiers = extractedSizeModifiersExtractSizeAndCornerRadiusModifiers.getSizeModifiers();
        GlanceModifier nonSizeModifiers = extractedSizeModifiersExtractSizeAndCornerRadiusModifiers.getNonSizeModifiers();
        arrayList.add(sizeModifiers);
        arrayList2.add(SizeModifiersKt.fillMaxSize(nonSizeModifiers));
        EmittableBox emittableBox = new EmittableBox();
        emittableBox.setModifier(collect(arrayList));
        if (emittableImage != null) {
            emittableBox.getChildren().add(emittableImage);
        }
        List<Emittable> children = emittableBox.getChildren();
        emittable.setModifier(collect(arrayList2));
        children.add(emittable);
        if (emittableImage2 != null) {
            emittableBox.getChildren().add(emittableImage2);
        }
        return emittableBox;
    }

    private static final void transformTree(EmittableWithChildren emittableWithChildren, Function1<? super Emittable, ? extends Emittable> function1) {
        int i = 0;
        for (Object obj2 : emittableWithChildren.getChildren()) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            Emittable emittable = (Emittable) function1.invoke((Emittable) obj2);
            emittableWithChildren.getChildren().set(i, emittable);
            if (emittable instanceof EmittableWithChildren) {
                transformTree((EmittableWithChildren) emittable, function1);
            }
            i = i2;
        }
    }

    @NotNull
    public static final Map<String, List<LambdaAction>> updateLambdaActionKeys(@NotNull EmittableWithChildren emittableWithChildren) {
        List<Emittable> children = emittableWithChildren.getChildren();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 0;
        for (Object obj2 : children) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            Emittable emittable = (Emittable) obj2;
            Pair<LambdaAction, GlanceModifier> pairExtractLambdaAction = extractLambdaAction(emittable.getModifier());
            LambdaAction lambdaAction = (LambdaAction) pairExtractLambdaAction.f186385a;
            GlanceModifier glanceModifier = (GlanceModifier) pairExtractLambdaAction.f186386b;
            if (lambdaAction != null && !(emittable instanceof EmittableSizeBox)) {
                String str = lambdaAction.getKey() + '+' + i;
                LambdaAction lambdaAction2 = new LambdaAction(str, lambdaAction.getBlock());
                Object objO = linkedHashMap.get(str);
                if (objO == null) {
                    objO = a.o(linkedHashMap, str);
                }
                ((List) objO).add(lambdaAction2);
                emittable.setModifier(glanceModifier.then(new ActionModifier(lambdaAction2)));
            }
            if (emittable instanceof EmittableWithChildren) {
                for (Map.Entry<String, List<LambdaAction>> entry : updateLambdaActionKeys((EmittableWithChildren) emittable).entrySet()) {
                    String key = entry.getKey();
                    List<LambdaAction> value = entry.getValue();
                    Object objO2 = linkedHashMap.get(key);
                    if (objO2 == null) {
                        objO2 = a.o(linkedHashMap, key);
                    }
                    ((List) objO2).addAll(value);
                }
            }
            i = i2;
        }
        return linkedHashMap;
    }

    private static final void warnIfMultipleClickableActions(GlanceModifier glanceModifier) {
        if (((Number) glanceModifier.foldIn(0, NormalizeCompositionTreeKt$warnIfMultipleClickableActions$actionCount$1.INSTANCE)).intValue() > 1) {
        }
    }
}
