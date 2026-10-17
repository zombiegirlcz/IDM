package androidx.camera.video.internal.config;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u000fB1\b\u0002\u0012&\u0010\u0007\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0018\u0012\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\rR4\u0010\u0007\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0018\u0012\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000e¨\u0006\u0010"}, d2 = {"Landroidx/camera/video/internal/config/FormatComboRegistry;", "", "", "", "", "", "Landroidx/camera/video/internal/config/FormatCombo;", "formatComboMapping", "<init>", "(Ljava/util/Map;)V", "videoMime", "", "getCombosForVideo", "(Ljava/lang/String;)Ljava/util/List;", "Ljava/util/Map;", "Builder", "camera-video"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FormatComboRegistry {

    @NotNull
    private final Map<Integer, Map<String, Set<FormatCombo>>> formatComboMapping;

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR4\u0010\u0013\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0018\u0012\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u000f0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Landroidx/camera/video/internal/config/FormatComboRegistry$Builder;", "", "<init>", "()V", "", "format", "Lkotlin/Function1;", "Landroidx/camera/video/internal/config/FormatComboRegistry$Builder$ContainerScope;", "", "block", "container", "(ILkotlin/jvm/functions/Function1;)V", "Landroidx/camera/video/internal/config/FormatComboRegistry;", "build", "()Landroidx/camera/video/internal/config/FormatComboRegistry;", "", "", "", "Landroidx/camera/video/internal/config/FormatCombo;", "formatComboMapping", "Ljava/util/Map;", "ContainerScope", "camera-video"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {

        @NotNull
        private final Map<Integer, Map<String, Set<FormatCombo>>> formatComboMapping = new LinkedHashMap();

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u001a\u0010\u0004\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0005¢\u0006\u0004\b\t\u0010\nJ\"\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0004\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Landroidx/camera/video/internal/config/FormatComboRegistry$Builder$ContainerScope;", "", "container", "", "videoMap", "", "", "", "Landroidx/camera/video/internal/config/FormatCombo;", "<init>", "(ILjava/util/Map;)V", "support", "", "videoMimes", "", "audioMimes", "camera-video"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ContainerScope {
            private final int container;

            @NotNull
            private final Map<String, Set<FormatCombo>> videoMap;

            public ContainerScope(int i, @NotNull Map<String, Set<FormatCombo>> videoMap) {
                Intrinsics.checkNotNullParameter(videoMap, "videoMap");
                this.container = i;
                this.videoMap = videoMap;
            }

            public final void support(@NotNull List<String> videoMimes, @NotNull List<String> audioMimes) {
                Intrinsics.checkNotNullParameter(videoMimes, "videoMimes");
                Intrinsics.checkNotNullParameter(audioMimes, "audioMimes");
                for (String str : videoMimes) {
                    Map<String, Set<FormatCombo>> map = this.videoMap;
                    Set<FormatCombo> linkedHashSet = map.get(str);
                    if (linkedHashSet == null) {
                        linkedHashSet = new LinkedHashSet<>();
                        map.put(str, linkedHashSet);
                    }
                    Set<FormatCombo> set = linkedHashSet;
                    Iterator<T> it8 = audioMimes.iterator();
                    while (it8.hasNext()) {
                        set.add(new FormatCombo(this.container, str, (String) it8.next()));
                    }
                    set.add(new FormatCombo(this.container, str, null));
                }
                Map<String, Set<FormatCombo>> map2 = this.videoMap;
                Set<FormatCombo> linkedHashSet2 = map2.get(null);
                if (linkedHashSet2 == null) {
                    linkedHashSet2 = new LinkedHashSet<>();
                    map2.put(null, linkedHashSet2);
                }
                Set<FormatCombo> set2 = linkedHashSet2;
                Iterator<T> it9 = audioMimes.iterator();
                while (it9.hasNext()) {
                    set2.add(new FormatCombo(this.container, null, (String) it9.next()));
                }
            }
        }

        @NotNull
        public final FormatComboRegistry build() {
            return new FormatComboRegistry(this.formatComboMapping, null);
        }

        public final void container(int format, @NotNull Function1<? super ContainerScope, Unit> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            Map<Integer, Map<String, Set<FormatCombo>>> map = this.formatComboMapping;
            Integer numValueOf = Integer.valueOf(format);
            Map<String, Set<FormatCombo>> linkedHashMap = map.get(numValueOf);
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap<>();
                map.put(numValueOf, linkedHashMap);
            }
            block.invoke(new ContainerScope(format, linkedHashMap));
        }
    }

    public /* synthetic */ FormatComboRegistry(Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(map);
    }

    @NotNull
    public final List<FormatCombo> getCombosForVideo(String videoMime) {
        ArrayList arrayList = new ArrayList();
        Iterator<Map<String, Set<FormatCombo>>> it8 = this.formatComboMapping.values().iterator();
        while (it8.hasNext()) {
            Set<FormatCombo> set = it8.next().get(videoMime);
            if (set != null) {
                arrayList.addAll(set);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private FormatComboRegistry(Map<Integer, ? extends Map<String, ? extends Set<FormatCombo>>> map) {
        this.formatComboMapping = map;
    }
}
