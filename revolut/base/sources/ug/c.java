package ug;

import android.view.View;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;
import java.util.HashMap;

/* JADX INFO: loaded from: classes17.dex */
public final class c extends em.a implements GoogleMap.OnInfoWindowClickListener, GoogleMap.OnMarkerClickListener, GoogleMap.OnMarkerDragListener, GoogleMap.InfoWindowAdapter, GoogleMap.OnInfoWindowLongClickListener {
    @Override // com.google.android.gms.maps.GoogleMap.InfoWindowAdapter
    public final View getInfoContents(Marker marker) {
        return null;
    }

    @Override // com.google.android.gms.maps.GoogleMap.InfoWindowAdapter
    public final View getInfoWindow(Marker marker) {
        return null;
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener
    public final void onInfoWindowClick(Marker marker) {
        GoogleMap.OnInfoWindowClickListener onInfoWindowClickListener;
        b bVar = (b) ((HashMap) this.f127556b).get(marker);
        if (bVar == null || (onInfoWindowClickListener = bVar.f279913c) == null) {
            return;
        }
        onInfoWindowClickListener.onInfoWindowClick(marker);
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnInfoWindowLongClickListener
    public final void onInfoWindowLongClick(Marker marker) {
        GoogleMap.OnInfoWindowLongClickListener onInfoWindowLongClickListener;
        b bVar = (b) ((HashMap) this.f127556b).get(marker);
        if (bVar == null || (onInfoWindowLongClickListener = bVar.d) == null) {
            return;
        }
        onInfoWindowLongClickListener.onInfoWindowLongClick(marker);
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnMarkerClickListener
    public final boolean onMarkerClick(Marker marker) {
        GoogleMap.OnMarkerClickListener onMarkerClickListener;
        b bVar = (b) ((HashMap) this.f127556b).get(marker);
        if (bVar == null || (onMarkerClickListener = bVar.e) == null) {
            return false;
        }
        return onMarkerClickListener.onMarkerClick(marker);
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnMarkerDragListener
    public final void onMarkerDrag(Marker marker) {
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnMarkerDragListener
    public final void onMarkerDragEnd(Marker marker) {
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnMarkerDragListener
    public final void onMarkerDragStart(Marker marker) {
    }
}
