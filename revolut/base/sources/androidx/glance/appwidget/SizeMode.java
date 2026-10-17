package androidx.glance.appwidget;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Landroidx/glance/appwidget/SizeMode;", "", "Exact", "Single", "Landroidx/glance/appwidget/SizeMode$Exact;", "Landroidx/glance/appwidget/SizeMode$Single;", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface SizeMode {

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Landroidx/glance/appwidget/SizeMode$Exact;", "Landroidx/glance/appwidget/SizeMode;", "()V", "toString", "", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Exact implements SizeMode {

        @NotNull
        public static final Exact INSTANCE = new Exact();

        private Exact() {
        }

        @NotNull
        public String toString() {
            return "SizeMode.Exact";
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Landroidx/glance/appwidget/SizeMode$Single;", "Landroidx/glance/appwidget/SizeMode;", "()V", "toString", "", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Single implements SizeMode {

        @NotNull
        public static final Single INSTANCE = new Single();

        private Single() {
        }

        @NotNull
        public String toString() {
            return "SizeMode.Single";
        }
    }
}
